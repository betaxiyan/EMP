package com.tujia.Emp.enums;
public enum SexEnum {
    MAN("男"),
    WOMAN("女"),;


    private final String desc;

    SexEnum(String desc) {
        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }
}
