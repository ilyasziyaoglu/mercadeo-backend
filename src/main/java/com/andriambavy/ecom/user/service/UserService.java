package com.andriambavy.ecom.user.service;

import com.andriambavy.ecom.client.user.UserRequest;
import com.andriambavy.ecom.client.user.UserResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.common.basemodel.service.ServiceResult;
import com.andriambavy.ecom.user.db.entity.User;
import com.andriambavy.ecom.user.db.repository.UserRepository;
import com.andriambavy.ecom.user.mapper.UserMapper;
import com.andriambavy.ecom.user.mapper.UserUpdateMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class UserService extends AbstractBaseService<UserRequest, User, UserResponse, UserMapper> implements UserDetailsService {
    private UserRepository repository;
    private UserMapper mapper;
    private UserUpdateMapper updateMapper;

    public UserService(UserRepository repository, UserMapper mapper, UserUpdateMapper updateMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.updateMapper = updateMapper;
    }

    @Override
    public UserRepository getRepository() {
        return repository;
    }

    @Override
    public UserMapper getMapper() {
        return mapper;
    }

    @Override
    public UserUpdateMapper getUpdateMapper() {
        return updateMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Username not found with value: " + username));
        return user.get();
    }

    public ServiceResult<User> getUserByUsername(String username) {
        Optional<User> user = repository.findByUsername(username);
        return user.map(ServiceResult::new).orElseGet(() -> new ServiceResult<>(HttpStatus.NOT_FOUND, "User not found by the username: " + username));
    }
}
