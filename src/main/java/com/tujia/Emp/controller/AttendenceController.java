package com.tujia.Emp.controller;

import com.tujia.Emp.Service.AttendanceService;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attend")
public class AttendenceController {
    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(path = "/all", produces = "text/json;charset=UTF-8")
    public String selectAll() {
        return attendanceService.selectAll();
    }

    @RequestMapping(path = "/click", produces = "text/json;charset=UTF-8")
    public String  clickCard(int emp_id) {
        return attendanceService.clickCard(emp_id);
    }

}
