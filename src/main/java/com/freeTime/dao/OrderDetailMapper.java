package com.freeTime.dao;

import com.freeTime.domain.OrderDetail;
import com.freeTime.domain.OrderDetailExample;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    int countByExample(OrderDetailExample example);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);
}