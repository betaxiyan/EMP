package com.tujia.Emp.entity;


import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 个人基本信息实体类
 */

public class People {
    private String ID;
    private String name;
    private String sex;
    private String ethnic;//民族
    private Integer married;//婚姻状况

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private Date birth;

    private String education;//学历
    private String university;
    private String native_place;
    private String private_email;//个人邮箱
    private String phone_number;

    @Override
    public String toString() {
        return "People{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", ethnic='" + ethnic + '\'' +
                ", married=" + married +
                ", birth=" + birth +
                ", education='" + education + '\'' +
                ", university='" + university + '\'' +
                ", native_place='" + native_place + '\'' +
                ", private_email='" + private_email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getPrivate_email() {
        return private_email;
    }

    public void setPrivate_email(String private_email) {
        this.private_email = private_email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
