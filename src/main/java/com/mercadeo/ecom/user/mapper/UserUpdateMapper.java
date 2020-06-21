package com.mercadeo.ecom.user.mapper;

import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.mercadeo.ecom.user.db.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class UserUpdateMapper implements BaseUpdateMapper<UserRequest, User> {

	@Override
	public User toEntityForUpdate(UserRequest request, User entity) {
		if (entity == null) {
			entity = new User();
		}

		return entity;
	}
}
