package com.mercadeo.ecom.user.controller;

import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.client.user.UserResponse;
import com.mercadeo.ecom.common.basemodel.controller.AbstractBaseController;
import com.mercadeo.ecom.user.db.entity.User;
import com.mercadeo.ecom.user.mapper.UserMapper;
import com.mercadeo.ecom.user.service.UserService;
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
