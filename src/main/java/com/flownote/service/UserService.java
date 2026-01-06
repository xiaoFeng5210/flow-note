package com.flownote.service;


import com.flownote.dto.user.UserCreateRequest;
import com.flownote.entity.User;
import com.flownote.repository.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

//    public create(UserCreateRequest user) {
//
//    }
}
