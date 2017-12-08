package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.Attendance;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface AttendanceDao {
    public List<Attendance> selectAllAttendance();
    public List<Attendance> selectAttendanceByemp_id(int emp_id);
    public void insertAttendance(Attendance attendance);
    public void updateAttendance(Attendance attendance);

    Attendance selectTodayAddByempid(int emp_id);
}
