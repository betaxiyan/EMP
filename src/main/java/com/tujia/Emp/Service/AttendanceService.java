package com.tujia.Emp.Service;

import com.tujia.Emp.entity.Attendance;

public interface AttendanceService {
    public  String selectAll();

    String clickCard(int emp_id);

    Attendance selectTodayAddByempid(int emp_id);
}
