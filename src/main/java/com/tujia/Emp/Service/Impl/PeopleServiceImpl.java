package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;


    public String selectAll() {

        List list=peopleDao.selectAll();
        return JSON.toJSONString(list);

    }
}
