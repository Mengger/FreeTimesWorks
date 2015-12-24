package com.freeTime.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freeTime.dao.AutoMobileMapper;
import com.freeTime.domain.AutoMobile;
import com.freeTime.service.AutoMobileService;

@Service("autoMobileService")
public class AutoMobileServiceImpl implements AutoMobileService {
	
	@Autowired
	private AutoMobileMapper autoMobileMapper;

	public void insert() {
		AutoMobile automobile=new AutoMobile();
		automobile.setAutomobileBrand("一汽大众");
		automobile.setModifyTime(new Date());
		automobile.setFrameNumber("lbsfasdfasdf24566");
		System.out.println("kai");
		System.out.println(String.valueOf(autoMobileMapper));
		System.out.println("end");
		autoMobileMapper.insert(automobile);
	}
}
