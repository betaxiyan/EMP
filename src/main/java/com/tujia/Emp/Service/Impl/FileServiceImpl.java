package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.FileDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.FileService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;



}
