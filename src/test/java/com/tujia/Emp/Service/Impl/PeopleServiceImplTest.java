package com.tujia.Emp.Service.Impl;

import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.People;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-mybatis.xml")
public class PeopleServiceImplTest {

    @Autowired
    private PeopleService peopleService;
    @Test
    public void selectAllPeople() throws Exception {
        System.out.println(peopleService.selectAllPeople());
    }

    @Test
    public void insertPeople() throws Exception {
        DateTime dateTime = new DateTime();

        People people = new People();

        people.setID("371522199611171112");
        people.setSex("男");
        people.setBirth(dateTime.toDate());
        people.setEducation("本科");
        people.setEthnic("汉族");
        System.out.println(peopleService.insertPeople(people));
    }

    @Test
    public void updatePeople() throws Exception {
        People people = new People();
        System.out.println(peopleService.updatePeople(people));
    }

    @Test
    public void deletaPeople() throws Exception {
        People people = new People();
        System.out.println(peopleService.deletaPeople(people.getID()));
    }



}