package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.People;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface PeopleDao {
    public List<People> selectAll();
}
