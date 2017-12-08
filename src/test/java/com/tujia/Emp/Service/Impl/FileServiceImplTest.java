package com.tujia.Emp.Service.Impl;

import com.tujia.Emp.Service.FileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-mybatis.xml")
public class FileServiceImplTest {
    @Autowired
    private FileService fileService;
    @Test
    public void selectAllByID() throws Exception {
    }

    @Test
    public void selectFileByFileid() throws Exception {
    }

    @Test
    public void selectFileByIDandDate() throws Exception {
        Format format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(
                fileService.selectFileByIDandDate(
                        "123562453123456789",
                        (Date) format.parseObject("2014-07-11"),
                        (Date) format.parseObject("2018-07-11")

                )
        );
    }

    @Test
    public void deleteFileByFileid() throws Exception {
    }

    @Test
    public void insertFile() throws Exception {
    }

    @Test
    public void updateFile() throws Exception {
    }

}