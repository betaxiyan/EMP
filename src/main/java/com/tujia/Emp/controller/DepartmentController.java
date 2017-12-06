package com.tujia.Emp.controller;

import com.tujia.Emp.Service.DepartmentService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(path = "/all", produces = "text/json;charset=UTF-8")
    public String selectAll() {
        return departmentService.selectAllDepartment();
    }

    @RequestMapping(path = "/byid", produces = "text/json;charset=UTF-8")
    public String selectDepartmentById(int depart_id) {
        return departmentService.selectDepartmentById(depart_id);
    }

    @RequestMapping(path = "/byname", produces = "text/json;charset=UTF-8")
    public String selectPeopleByName(String depart_name) {
        return departmentService.selectPeopleByName(depart_name);
    }

    @RequestMapping(path = "/insert", produces = "text/json;charset=UTF-8")
    public String insertDepartment(Department department) {
        return departmentService.insertDepartment(department);
    }

    @RequestMapping(path = "/delete", produces = "text/json;charset=UTF-8")
    public String deleteDepartmentByID(int depart_id) {
        return departmentService.deleteDepartmentByID(depart_id);
    }

    @RequestMapping(path = "/upload", produces = "text/json;charset=UTF-8")
    public String updateDepartment(Department department) {
        return departmentService.updateDepartment(department);
    }


}
