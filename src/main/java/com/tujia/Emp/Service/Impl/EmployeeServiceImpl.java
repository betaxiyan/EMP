package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.EmployeeDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.EmployeeService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Employee;
import com.tujia.Emp.enums.ResultEnum;
import com.tujia.Emp.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public String selectAllEmployee() {
        List list;
        try{
            list = employeeDao.selectAllEmployee();
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String selectEmployeeByemp_id(int emp_id) {
        Employee employee;
        try{
             employee = employeeDao.selectEmployeeByemp_id(emp_id);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(employee));
    }

    public String selectEmployeeByID(String ID) {
        Employee employee;
        try{
            employee = employeeDao.selectEmployeeByID(ID);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(employee));
    }

    public String insertEmployee(Employee employee) {
        try{
            employeeDao.insertEmployee(employee);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String deleteEmployeeByemp_id(int emp_id) {
        try{
            employeeDao.deleteEmployeeByemp_id(emp_id);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String deleteEmployeeByID(String ID) {
        try {
            employeeDao.deleteEmployeeByID(ID);
        }catch (Exception e){
        return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
    }
        return JSON.toJSONString(ResultUtil.success());
    }


    public String updateEmployee(Employee employee) {
        try{
            employeeDao.updateEmployee(employee);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }
}
