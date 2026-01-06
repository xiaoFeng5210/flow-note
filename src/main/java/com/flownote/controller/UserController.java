package com.flownote.controller;

import com.flownote.dto.user.UserCreateRequest;
import com.flownote.entity.User;
import com.flownote.service.UserService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.flownote.dto.Response;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/register")
//    public Response<Integer> create(@Valid @RequestBody UserCreateRequest user) {
//
//    }

    /**
     * 获取所有用户
     *
     * @return List<User>
     */
    @GetMapping("/find-all")
    public Response<List<User>> findAll() {
        try {
            final List<User> users = userService.getAllUsers();
            return Response.success("获取成功", users);
        } catch (Exception e) {
            return Response.error(-1, e.getMessage());
        }
    }
}
