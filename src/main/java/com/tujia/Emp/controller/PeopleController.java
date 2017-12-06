package com.tujia.Emp.controller;

import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(path = "/all", produces = "text/json;charset=UTF-8")
    public String selectAll() {
        return peopleService.selectAllPeople();
    }

    @RequestMapping(path = "/insert", produces = "text/json;charset=UTF-8")
    public String insertPeople(People people) {
        return peopleService.insertPeople(people);
    }

    @RequestMapping(path = "/update", produces = "text/json;charset=UTF-8")
    public String updatePeople(People people) {
        return peopleService.updatePeople(people);
    }

    @RequestMapping(path = "/sbyId", produces = "text/json;charset=UTF-8")
    public String selectPeopleById(String ID) {
        return peopleService.selectPeopleByID(ID);
    }

    @RequestMapping(path = "/sbyName", produces = "text/json;charset=UTF-8")
    public String selectPeopleByName(String name) {
        return peopleService.selectPeopleByName(name);
    }

}
