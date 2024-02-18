package com.example.demo.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {
    private Integer code;
    private String message;


    public ResponseVo(T t) {
    }
}
