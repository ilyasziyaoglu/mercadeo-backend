package com.mercadeo.ecom.common.auth.controller;

import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.common.auth.request.LoginRequest;
import com.mercadeo.ecom.common.auth.request.RegisterRequest;
import com.mercadeo.ecom.common.auth.response.LoginResponse;
import com.mercadeo.ecom.common.basemodel.service.ServiceResult;
import com.mercadeo.ecom.common.utils.JwtUtil;
import com.mercadeo.ecom.user.db.entity.User;
import com.mercadeo.ecom.user.mapper.UserMapper;
import com.mercadeo.ecom.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-24
 */

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/auth")
public class AuthController {

	final private AuthenticationManager authenticationManager;
	final private UserService userService;
	final private UserMapper userMapper;
	final private JwtUtil jwtUtil;
	private BCryptPasswordEncoder passwordEncoder;

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
	public ResponseEntity<?> register(@RequestHeader("Authentication") String token, @RequestBody RegisterRequest request) throws Exception {

		UserRequest user = new UserRequest();
		user.setUsername(request.getEmail());
		user.setFullName(request.getFullName());
		user.setEmail(request.getEmail());
		user.setGender(request.getGender());
		user.setPassword(getPasswordEncoder().encode(request.getPassword()));
		user.setRoles("USER");

		ServiceResult<User> serviceResult = userService.save(token, user);
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

			token = jwtUtil.generateToken(userDetails);

			return ResponseEntity.ok(new LoginResponse(token, userMapper.toResponse(serviceResult.getValue())));
		}

		return ResponseEntity.badRequest().build();
	}

	private PasswordEncoder getPasswordEncoder() {
		if (passwordEncoder == null) {
			passwordEncoder = new BCryptPasswordEncoder();
		}
		return passwordEncoder;
	}
}
