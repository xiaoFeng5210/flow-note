package com.flownote.service;


import com.flownote.dto.user.UserCreateRequest;
import com.flownote.entity.User;
import com.flownote.repository.UserMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
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

    public Integer create(UserCreateRequest user) {
        return userMapper.create(user);
    }

    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
