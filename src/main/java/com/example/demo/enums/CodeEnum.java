package com.example.demo.enums;

public enum CodeEnum {
    FAILUIRE(100000,"失败");
    private Integer code;
    private String desc;

    CodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
