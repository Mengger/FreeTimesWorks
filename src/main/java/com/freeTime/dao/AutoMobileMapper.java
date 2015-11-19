package com.freeTime.dao;

import com.freeTime.domain.AutoMobile;

public interface AutoMobileMapper {
    int deleteByPrimaryKey(String frameNumber);

    int insert(AutoMobile record);

    int insertSelective(AutoMobile record);

    AutoMobile selectByPrimaryKey(String frameNumber);

    int updateByPrimaryKeySelective(AutoMobile record);

    int updateByPrimaryKey(AutoMobile record);
}