package com.freeTime.dao;

import com.freeTime.domain.PartInfo;
import com.freeTime.domain.PartInfoExample;
import org.apache.ibatis.annotations.Param;

public interface PartInfoMapper {
    int countByExample(PartInfoExample example);

    int insert(PartInfo record);

    int insertSelective(PartInfo record);

    int updateByExampleSelective(@Param("record") PartInfo record, @Param("example") PartInfoExample example);

    int updateByExample(@Param("record") PartInfo record, @Param("example") PartInfoExample example);
}