package com.flownote.dto;

import lombok.Data;

@Data
public class Response<T> {

    private Integer code;

    private String message;

    private T data;

    public static <T> Response<T> success(String message, T data) {
        Response<T> response = new Response<>();
        response.setCode(0);
        response.setMessage(message);
        response.setData(data);
        return response;
    }


    public static <T> Response<T> error(Integer code, String message) {
        Response<T> response = new Response<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }
}
