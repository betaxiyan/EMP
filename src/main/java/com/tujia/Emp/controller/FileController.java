package com.tujia.Emp.controller;

import com.tujia.Emp.Service.FileService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/all")
    public String selectAll(){
        return null;
    }
}
