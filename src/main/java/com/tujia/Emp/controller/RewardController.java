package com.tujia.Emp.controller;

import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.Service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardController {
    @Autowired
    private RewardService rewardService;}


