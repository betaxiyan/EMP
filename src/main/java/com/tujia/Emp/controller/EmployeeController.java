package com.tujia.Emp.controller;

import com.tujia.Emp.Service.EmployeeService;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/all")
    public String selectAll(){
        return null;
    }
}
