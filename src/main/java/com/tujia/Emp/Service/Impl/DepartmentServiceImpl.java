package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.DepartmentDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.DepartmentService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Department;
import com.tujia.Emp.enums.ResultEnum;
import com.tujia.Emp.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    public String selectAllDepartment() {
        List list;
        try{
            list = departmentDao.selectAllDepartment();
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String selectDepartmentById(int depart_id) {
        Department department;
        try{
            department = departmentDao.selectDepartmentById(depart_id);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(department));
    }

    public String selectPeopleByName(String depart_name) {
        List list;
        try{
            list = departmentDao.selectPeopleByName(depart_name);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String insertDepartment(Department department) {
        try{
             departmentDao.insertDepartment(department);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String deleteDepartmentByID(int depart_id) {
        try{
            departmentDao.deleteDepartmentByID(depart_id);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String updateDepartment(Department department) {
        try{
            departmentDao.updateDepartment(department);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }
}
