package com.andriambavy.ecom.user.mapper;

import com.andriambavy.ecom.client.user.UserRequest;
import com.andriambavy.ecom.common.basemodel.mapper.BaseUpdateMapper;
import com.andriambavy.ecom.user.db.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Component
public class UserUpdateMapper implements BaseUpdateMapper<UserRequest, User> {

	@Override
	public User toEntityForUpdate(UserRequest request, User entity) {
		return null;
	}
}
