package com.aym.mapper;


import com.aym.model.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(String staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}