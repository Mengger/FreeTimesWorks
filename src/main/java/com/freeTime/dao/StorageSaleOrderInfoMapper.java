package com.freeTime.dao;

import com.freeTime.domain.StorageSaleOrderInfo;

public interface StorageSaleOrderInfoMapper {
    int insert(StorageSaleOrderInfo record);

    int insertSelective(StorageSaleOrderInfo record);
}