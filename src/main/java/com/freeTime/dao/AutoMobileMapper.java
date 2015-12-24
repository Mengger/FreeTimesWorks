package com.freeTime.dao;

import com.freeTime.domain.AutoMobile;

public interface AutoMobileMapper {
	/**
	 * 通过车架号，删除该信息
	 * @param frameNumber	车架号
	 * @return
	 */
    int deleteByPrimaryKey(String frameNumber);

    /**
     * 新增车辆信息
     * @param record
     * @return
     */
    int insert(AutoMobile record);

    
    int insertSelective(AutoMobile record);

    
    /**
     * 根据车架号查询车辆信息
     * @param frameNumber
     * @return
     */
    AutoMobile selectByPrimaryKey(String frameNumber);

    /**
     * 更新车辆信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(AutoMobile record);

    int updateByPrimaryKey(AutoMobile record);
}