package com.tujia.Emp.controller;

import com.tujia.Emp.Service.FileService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    /*
    * public String selectAllByID(String ID);

    public String selectFileByFileid(int Fileid);

    public String selectFileByIDandDate(String ID, Date start_date, Date end_date);

    public String deleteFileByFileid(int fileid);

    public String insertFile(File file);

    public String updateFile(File file);*/
    @RequestMapping(path = "/all", produces = "text/json;charset=UTF-8")
    public String selectAllll() {
        return fileService.selectAllll();
    }

    @RequestMapping(path = "/byID", produces = "text/json;charset=UTF-8")
    public String selectAll(String ID) {
        return fileService.selectAllByID(ID);
    }
    @RequestMapping(path = "/byfileid", produces = "text/json;charset=UTF-8")
    public String selectFileByFileid(int fileid) {
        return fileService.selectFileByFileid(fileid);
    }
    @RequestMapping(path = "/ByIDandDate", produces = "text/json;charset=UTF-8")
    public String selectFileByIDandDate(String ID, Date start_date, Date end_date){
        return fileService.selectFileByIDandDate(ID,start_date,end_date);
    }

    @RequestMapping(path = "/insert", produces = "text/json;charset=UTF-8")
    public String insertFile(File file){
        return fileService.insertFile(file);

    }

    @RequestMapping(path = "/delete", produces = "text/json;charset=UTF-8")
    public String deleteFileByFileid(int fileid){

        System.out.println(fileid);
        return fileService.deleteFileByFileid(fileid);
    }



}
