package com.freeTime.dao;

import com.freeTime.domain.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String idCardNo);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String idCardNo);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}