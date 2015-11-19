package com.freeTime.dao;

import com.freeTime.domain.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderNum);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderNum);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}