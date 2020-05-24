package com.mercadeo.ecom.user.mapper;

import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.client.user.UserResponse;
import com.mercadeo.ecom.common.basemodel.mapper.BaseMapper;
import com.mercadeo.ecom.user.db.entity.User;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<UserRequest, User, UserResponse> {
}
