package com.tujia.Emp.Dao;

import com.tujia.Emp.entity.Reward;

import java.util.Date;
import java.util.List;

public interface RewardDao {
    public List<Reward> selectRewardByemp_id(int emp_id);

    public Reward selectRewardByRewardid(int Rewardid);

    public List<Reward> selectRewardByIDandDate(int emp_id, Date start_date, Date end_date);

    public List<Reward> selectRewardByIDandtype(int emp_id, boolean type);

    public void deleteRewardByRewardid(int Rewardid);

    public void insertReward(Reward reward);

    public void updateReward(Reward reward);
}
