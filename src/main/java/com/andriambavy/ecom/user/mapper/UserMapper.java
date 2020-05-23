package com.andriambavy.ecom.user.mapper;

import com.andriambavy.ecom.client.user.UserRequest;
import com.andriambavy.ecom.client.user.UserResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import com.andriambavy.ecom.user.db.entity.User;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<UserRequest, User, UserResponse> {
}
