package com.flownote.repository;

import com.flownote.dto.user.UserCreateRequest;
import com.flownote.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    Integer create(UserCreateRequest user);
}
