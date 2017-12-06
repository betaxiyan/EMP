package com.tujia.Emp.Service;

import com.tujia.Emp.entity.Employee;

public interface EmployeeService {
    public String selectAllEmployee();
    public String selectEmployeeByemp_id(int emp_id);
    public String selectEmployeeByID(String ID);
    public String insertEmployee(Employee employee);
    public String deleteEmployeeByemp_id(int emp_id);
    public String deleteEmployeeByID(String ID);
    public String updateEmployee(Employee employee);
}
