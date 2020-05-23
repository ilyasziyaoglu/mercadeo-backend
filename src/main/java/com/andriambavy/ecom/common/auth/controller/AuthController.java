package com.andriambavy.ecom.common.auth.controller;

import com.andriambavy.ecom.client.user.UserRequest;
import com.andriambavy.ecom.common.auth.request.LoginRequest;
import com.andriambavy.ecom.common.auth.request.RegisterRequest;
import com.andriambavy.ecom.common.auth.response.LoginResponse;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.common.utils.JwtUtil;
import com.andriambavy.ecom.user.db.entity.User;
import com.andriambavy.ecom.user.mapper.UserMapper;
import com.andriambavy.ecom.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-24
 */

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

	private AuthenticationManager authenticationManager;
	private UserService userService;
	private UserMapper userMapper;
	private JwtUtil jwtUtil;

	public AuthController(
			final AuthenticationManager authenticationManager,
			final UserService userService,
			final UserMapper userMapper,
			final JwtUtil jwtUtil
	) {
		this.authenticationManager = authenticationManager;
		this.userService = userService;
		this.userMapper = userMapper;
		this.jwtUtil = jwtUtil;
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest request) throws Exception {

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							request.getEmail(),
							request.getPassword()
					)
			);
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password!", e);
		}

		final UserDetails userDetails = userService.loadUserByUsername(request.getEmail());
		ServiceResult<User> serviceResult = userService.getUserByUsername(request.getEmail());

		String token = jwtUtil.generateToken(userDetails);

		return ResponseEntity.ok(new LoginResponse(token, userMapper.toResponse(serviceResult.getValue())));
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody RegisterRequest request) throws Exception {

		UserRequest user = new UserRequest();
		user.setUsername(request.getEmail());
		user.setFullName(request.getFullName());
		user.setEmail(request.getEmail());
		user.setGender(request.getGender());
		user.setPassword(request.getPassword());
		user.setRoles("USER");

		ServiceResult<User> serviceResult = userService.save(user);
		if (serviceResult.isSuccess()) {
			try {
				authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(
								request.getEmail(),
								request.getPassword()
						)
				);
			} catch (BadCredentialsException e) {
				throw new Exception("Incorrect username or password!", e);
			}

			final UserDetails userDetails = userService.loadUserByUsername(request.getEmail());

			String token = jwtUtil.generateToken(userDetails);

			return ResponseEntity.ok(new LoginResponse(token, userMapper.toResponse(serviceResult.getValue())));
		}

		return ResponseEntity.badRequest().build();
	}
}
