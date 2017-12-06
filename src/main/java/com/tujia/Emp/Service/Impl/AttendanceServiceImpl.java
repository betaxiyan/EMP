package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.AttendanceDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.AttendanceService;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AttendanceService")
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceDao attendanceDao;



}
