package com.tujia.Emp.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

/**
 *考勤信息实体类
 */
public class Attendance {
    private int emp_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private Date date;

    @JSONField(format="HH:mm:ss")
    private Time work_time;

    @JSONField(format="HH:mm:ss")
    private Time offwork_time;
    private Boolean checked;
    private int  flag;

    @Override
    public String toString() {
        return "Attendance{" +
                "emp_id=" + emp_id +
                ", date=" + date +
                ", work_time=" + work_time +
                ", offwork_time=" + offwork_time +
                ", checked=" + checked +
                ", flag=" + flag +
                '}';
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getWork_time() {
        return work_time;
    }

    public void setWork_time(Time work_time) {
        this.work_time = work_time;
    }

    public Time getOffwork_time() {
        return offwork_time;
    }

    public void setOffwork_time(Time offwork_time) {
        this.offwork_time = offwork_time;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
