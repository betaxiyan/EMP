package com.tujia.Emp.Service;


import com.tujia.Emp.entity.People;

public interface PeopleService {
    public String selectAllPeople();
    public String insertPeople(People people);
    public String updatePeople(People people);
    public String deletaPeople(String ID);
    public String selectPeopleByName(String name);
    public String selectPeopleByID(String id);

}
