package com.tujia.Emp.Service;

import com.tujia.Emp.entity.File;

import java.util.Date;
import java.util.List;

public interface FileService {
    public String selectAllByID(String ID);

    public String selectFileByFileid(int Fileid);

    public String selectFileByIDandDate(String ID, Date start_date, Date end_date);

    public String deleteFileByFileid(int fileid);

    public String insertFile(File file);

    public String updateFile(File file);

    String selectAllll();
}
