package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.Department;
import com.tujia.Emp.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> selectAllEmployee();
    public Employee selectEmployeeByemp_id(int emp_id);
    public Employee selectEmployeeByID(String ID);
    public void insertEmployee(Employee employee);
    public void deleteEmployeeByemp_id(int emp_id);
    public void deleteEmployeeByID(String ID);
    public void updateEmployee(Employee employee);
}
