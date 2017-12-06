package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.People;
import com.tujia.Emp.entity.Result;
import com.tujia.Emp.enums.ResultEnum;
import com.tujia.Emp.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;


    public String selectAllPeople() {
        List list;
        try {
            list=peopleDao.selectAllPeople();
            System.out.println(((People)list.get(0)).getBirth());
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));

    }

    public String insertPeople(People people) {
        try{
            peopleDao.insertPeople(people);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());

    }

    public String updatePeople(People people) {
        try {
            peopleDao.updatePeople(people);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String deletaPeople(String ID) {
        try {
            peopleDao.deletePeopleByID(ID);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String selectPeopleByName(String name) {
        List list;
        try {
             list = peopleDao.selectPeopleByName(name);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String selectPeopleByID(String id) {
        People P1;
        try {
             P1 = peopleDao.selectPeopleByID(id);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(P1));
    }
}
