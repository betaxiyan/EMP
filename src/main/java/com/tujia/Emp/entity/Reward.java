package com.tujia.Emp.entity;

import java.util.Date;

/**
 * 奖励惩罚表实体类
 * */

public class Reward {
    private  int emp_id;
    private Date DATE;
    private String description;
    private boolean type;
    private double money;
    private boolean to_file;

    @Override
    public String toString() {
        return "Reward{" +
                "emp_id=" + emp_id +
                ", DATE=" + DATE +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", money=" + money +
                ", to_file=" + to_file +
                '}';
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isTo_file() {
        return to_file;
    }

    public void setTo_file(boolean to_file) {
        this.to_file = to_file;
    }
}
