package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.People;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface PeopleDao {
    public List<People> selectAllPeople();
    public People selectPeopleByID(String id);
    public List<People> selectPeopleByName(String name);
    public void insertPeople(People people);
    public void deletePeopleByID(String id);
    public void updatePeople(People people);
   // public List<People> selectByAllCondition();

}
