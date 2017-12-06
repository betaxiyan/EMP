package com.tujia.Emp.enums;

public enum MarriedEnum {
    unmarried("未婚"),
    married("已婚"),
    Divorced("离异"),;
    public final String desc;

    MarriedEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
