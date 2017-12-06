package com.tujia.Emp.entity;

import com.tujia.Emp.enums.SexEnum;

public class Department {
    private int depart_id;
    private String depart_name;
    private int head_id;

    @Override
    public String toString() {
        return "Department{" +
                "depart_id=" + depart_id +
                ", depart_name='" + depart_name + '\'' +
                ", head_id=" + head_id +
                '}';
    }

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public int getHead_id() {
        return head_id;
    }

    public void setHead_id(int head_id) {
        this.head_id = head_id;
    }
}
