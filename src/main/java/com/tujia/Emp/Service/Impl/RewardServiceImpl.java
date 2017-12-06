package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Dao.RewardDao;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.Service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RewardService")
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardDao rewardDao;


    public String selectAll() {
        return null;

    }
}
