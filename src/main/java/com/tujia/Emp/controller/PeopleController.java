package com.tujia.Emp.controller;

import com.tujia.Emp.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/all")
    public String selectAll(){
        return peopleService.selectAll();
    }
}
