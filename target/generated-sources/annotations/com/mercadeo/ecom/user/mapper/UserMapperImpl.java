package com.mercadeo.ecom.user.mapper;

import com.mercadeo.ecom.client.user.UserRequest;
import com.mercadeo.ecom.client.user.UserResponse;
import com.mercadeo.ecom.user.db.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-24T17:28:56+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( request.getUsername() );
        user.setId( request.getId() );
        user.setPassword( request.getPassword() );
        user.setFullName( request.getFullName() );
        user.setImageUrl( request.getImageUrl() );
        user.setEmail( request.getEmail() );
        user.setGender( request.getGender() );
        user.setCountry( request.getCountry() );
        user.setPhone( request.getPhone() );
        user.setAddresses( request.getAddresses() );
        user.setRoles( request.getRoles() );

        return user;
    }

    @Override
    public UserResponse toResponse(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( entity.getId() );
        userResponse.setUsername( entity.getUsername() );
        userResponse.setFullName( entity.getFullName() );
        userResponse.setImageUrl( entity.getImageUrl() );
        userResponse.setEmail( entity.getEmail() );
        userResponse.setPhone( entity.getPhone() );
        userResponse.setAddresses( entity.getAddresses() );
        userResponse.setRoles( entity.getRoles() );
        userResponse.setGender( entity.getGender() );
        userResponse.setCountry( entity.getCountry() );

        return userResponse;
    }

    @Override
    public List<User> toEntity(List<UserRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( requestList.size() );
        for ( UserRequest userRequest : requestList ) {
            list.add( toEntity( userRequest ) );
        }

        return list;
    }

    @Override
    public List<UserResponse> toResponse(List<User> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( requestList.size() );
        for ( User user : requestList ) {
            list.add( toResponse( user ) );
        }

        return list;
    }
}
