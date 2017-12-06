package com.tujia.Emp.Service;

import com.tujia.Emp.entity.Department;

public interface DepartmentService {
    public String selectAllDepartment();
    public String selectDepartmentById(int depart_id);
    public String selectPeopleByName(String depart_name);
    public String insertDepartment(Department department);
    public String deleteDepartmentByID(int depart_id);
    public String updateDepartment(Department department);
}
