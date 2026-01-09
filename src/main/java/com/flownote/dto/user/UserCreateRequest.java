package com.flownote.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class UserCreateRequest {
    @NotBlank(message = "用户名不能为空")

    @Size(min = 6, max = 20, message = "密码长度必须在6-20之间")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank()
    private String email;

    @NotBlank()
    private String phone;

    @NotBlank()
    private String address;

    @NotNull()
    private LocalDate birthday;
}
