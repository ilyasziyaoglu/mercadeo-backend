package com.andriambavy.ecom.user.controller;

import com.andriambavy.ecom.client.user.UserRequest;
import com.andriambavy.ecom.client.user.UserResponse;
import com.andriambavy.ecom.common.basemodel.controller.AbstractBaseController;
import com.andriambavy.ecom.user.db.entity.User;
import com.andriambavy.ecom.user.mapper.UserMapper;
import com.andriambavy.ecom.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@RestController
@RequestMapping(value = "/user")
public class UserController extends AbstractBaseController<UserRequest, User, UserResponse, UserMapper, UserService> {
	private UserService service;
	private UserMapper mapper;

	public UserController(final UserService service, final UserMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	public UserService getService() {
		return service;
	}

	public UserMapper getMapper() {
		return mapper;
	}
}
