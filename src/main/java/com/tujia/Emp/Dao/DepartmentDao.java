package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.Department;

import java.util.List;

public interface DepartmentDao {
    public List<Department> selectAllDepartment();
    public Department selectDepartmentById(int depart_id);
    public List<Department> selectPeopleByName(String depart_name);
    public void insertDepartment(Department department);
    public void deleteDepartmentByID(int depart_id);
    public void updateDepartment(Department department);
}
