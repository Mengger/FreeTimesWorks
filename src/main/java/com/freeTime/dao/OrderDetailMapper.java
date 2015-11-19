package com.freeTime.dao;

import com.freeTime.domain.OrderDetail;

public interface OrderDetailMapper {
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);
}