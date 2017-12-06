package com.tujia.Emp.controller;

import com.tujia.Emp.Service.EmployeeService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
        /*
        *
        * public List<Employee> selectAllEmployee();
    public Employee selectEmployeeByemp_id(int emp_id);
    public Employee selectEmployeeByID(String ID);
    public void insertEmployee(Employee employee);
    public void deleteEmployeeByemp_id(int emp_id);
    public void deleteEmployeeByID(int ID);
    public void updateEmployee(Employee employee);
    */
    @RequestMapping("/all")
    private  String selectAllEmployee(){
        return employeeService.selectAllEmployee();
    }

    @RequestMapping("/byempid")
    private  String selectEmployeeByemp_id(int emp_id){
        return employeeService.selectEmployeeByemp_id(emp_id);
    }
    @RequestMapping("/byID")
    private  String selectEmployeeByID(String ID){
        return employeeService.selectEmployeeByID(ID);
    }
    @RequestMapping("/insert")
    private  String insertEmployee(Employee employee){
        return employeeService.insertEmployee(employee);
    }
    @RequestMapping("/deleteByid")
    private  String deleteEmployeeByID(String ID){
        return employeeService.deleteEmployeeByID(ID);
    }
    @RequestMapping("/delByEmpid")
    private  String deleteEmployeeByemp_id(int emp_id){
        return employeeService.deleteEmployeeByemp_id(emp_id);
    }
    @RequestMapping("/update")
    private  String updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }


}
