package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.FileDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.FileService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.File;
import com.tujia.Emp.enums.ResultEnum;
import com.tujia.Emp.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("FileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;

    public String selectAllll() {
        List list;
        try {
            list = fileDao.selectAllll();
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String selectAllByID(String ID) {
        List list;
        try {
            list = fileDao.selectAllByID(ID);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String selectFileByFileid(int Fileid) {
        File file;
        try {
            file = fileDao.selectFileByFileid(Fileid);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(file));
    }

    public String selectFileByIDandDate(String ID, Date start_date, Date end_date) {

        List list;
        try {
            list = fileDao.selectFileByIDandDate(ID,start_date,end_date);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }

    public String deleteFileByFileid(int fileid) {
        try {
            fileDao.deleteFileByFileid(fileid);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String insertFile(File file) {
        try {
            fileDao.insertFile(file);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }

    public String updateFile(File file) {
        try {
            fileDao.updateFile(file);
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());
    }


}
