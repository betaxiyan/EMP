package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.DepartmentDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.DepartmentService;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    public String selectAll() {

        return null;

    }
}
