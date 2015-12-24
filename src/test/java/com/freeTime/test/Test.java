package com.freeTime.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.freeTime.service.AutoMobileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/Spring/spring.xml")
public class Test {

	@Autowired
	private AutoMobileService autoMobileService;
	
	@org.junit.Test
	public void  insert(){
		autoMobileService.insert();
	}
	
}
