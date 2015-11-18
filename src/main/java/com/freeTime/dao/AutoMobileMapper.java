package com.freeTime.dao;

import com.freeTime.domain.AutoMobile;
import com.freeTime.domain.AutoMobileExample;
import org.apache.ibatis.annotations.Param;

public interface AutoMobileMapper {
    int countByExample(AutoMobileExample example);

    int deleteByPrimaryKey(String frameNumber);

    int insert(AutoMobile record);

    int insertSelective(AutoMobile record);

    AutoMobile selectByPrimaryKey(String frameNumber);

    int updateByExampleSelective(@Param("record") AutoMobile record, @Param("example") AutoMobileExample example);

    int updateByExample(@Param("record") AutoMobile record, @Param("example") AutoMobileExample example);

    int updateByPrimaryKeySelective(AutoMobile record);

    int updateByPrimaryKey(AutoMobile record);
}