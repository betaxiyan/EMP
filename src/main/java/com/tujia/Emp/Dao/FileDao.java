package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.File;

import java.util.Date;
import java.util.List;

public interface FileDao {

    public List<File> selectAllByID(String ID);

    public File selectFileByFileid(int Fileid);

    public List<File> selectFileByIDandDate(String ID, Date start_date,Date end_date);

    public void deleteFileByFileid(int fileid);

    public void deleteFileByID(String ID);

    public void insertFile(File file);

    public void updateFile(File file);


    public List selectAllll();
}
