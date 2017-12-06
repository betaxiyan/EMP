package com.tujia.Emp.controller;

import com.tujia.Emp.Service.DepartmentService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/all")
    public String selectAll(){
        return null;
    }
}
