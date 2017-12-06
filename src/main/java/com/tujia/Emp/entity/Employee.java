package com.tujia.Emp.entity;

import java.util.Date;

/**
 * 员工实体类
 */

public class Employee {
    private int emp_id;
    private int depart_id;
    private int ID;
    private String email;
    private int grade;
    private String position;
    private Date join_time;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", depart_id=" + depart_id +
                ", ID=" + ID +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                ", position='" + position + '\'' +
                ", join_time=" + join_time +
                '}';
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getJoin_time() {
        return join_time;
    }

    public void setJoin_time(Date join_time) {
        this.join_time = join_time;
    }
}
