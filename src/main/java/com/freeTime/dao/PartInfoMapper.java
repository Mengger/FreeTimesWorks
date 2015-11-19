package com.freeTime.dao;

import com.freeTime.domain.PartInfo;

public interface PartInfoMapper {
    int insert(PartInfo record);

    int insertSelective(PartInfo record);
}