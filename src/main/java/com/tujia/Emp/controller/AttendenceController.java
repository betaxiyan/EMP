package com.tujia.Emp.controller;

import com.tujia.Emp.Service.AttendanceService;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendenceController {
    @Autowired
    private AttendanceService attendanceService;

}
