package com.freeTime.dao;

import com.freeTime.domain.StorageSaleOrderInfo;
import com.freeTime.domain.StorageSaleOrderInfoExample;
import org.apache.ibatis.annotations.Param;

public interface StorageSaleOrderInfoMapper {
    int countByExample(StorageSaleOrderInfoExample example);

    int insert(StorageSaleOrderInfo record);

    int insertSelective(StorageSaleOrderInfo record);

    int updateByExampleSelective(@Param("record") StorageSaleOrderInfo record, @Param("example") StorageSaleOrderInfoExample example);

    int updateByExample(@Param("record") StorageSaleOrderInfo record, @Param("example") StorageSaleOrderInfoExample example);
}