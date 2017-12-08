package com.tujia.Emp.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.tujia.Emp.Dao.AttendanceDao;
import com.tujia.Emp.Dao.PeopleDao;
import com.tujia.Emp.Service.AttendanceService;
import com.tujia.Emp.Service.PeopleService;
import com.tujia.Emp.entity.Attendance;
import com.tujia.Emp.enums.ResultEnum;
import com.tujia.Emp.utils.ResultUtil;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Service("AttendanceService")
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceDao attendanceDao;


    public String selectAll() {
        List list;
        try{
            list = attendanceDao.selectAllAttendance();
        }catch (Exception e){
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success(list));
    }


    public String clickCard(int emp_id) {

        try{
            Attendance attendance = this.selectTodayAddByempid(emp_id);
            if (attendance!=null){//已经打过卡
                attendance.setOffwork_time(new Time(new Date().getTime()));
                if (timeBetweenAandB(attendance.getOffwork_time(),attendance.getWork_time())>=9){
                    attendance.setFlag(1);//工时已够
                }
                attendanceDao.updateAttendance(attendance);
            }else {//每天第一次打卡
                attendance = new Attendance();
                attendance.setFlag(0);//工时不够
                attendance.setWork_time(new Time(new Date().getTime()));
                attendance.setChecked(true);
                attendance.setEmp_id(emp_id);
                attendance.setDate(new Date());
                attendanceDao.insertAttendance(attendance);
            }
        }catch (Exception e){
            Logger logger =  Logger.getLogger("this");
            logger.info(e.getMessage());
            return JSON.toJSONString(ResultUtil.error(ResultEnum.Error.getCode(),e.getMessage()));
        }
        return JSON.toJSONString(ResultUtil.success());

    }

    public Attendance selectTodayAddByempid(int emp_id) {
        return attendanceDao.selectTodayAddByempid(emp_id);
    }

    public int timeBetweenAandB(Time a,Time b){
        return Math.abs((int) (b.getTime()-a.getTime())/1000/3600);
    }
}
