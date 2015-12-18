package com.freeTime.test;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.freeTime.dao.AutoMobileMapper;
import com.freeTime.domain.AutoMobile;

@ContextConfiguration("classpath:config/Spring/spring.xml")
public class Test {

	@Autowired
	private AutoMobileMapper autoMobileMapper;
	
	@org.junit.Test
	public void  insert(){
		AutoMobile automobile=new AutoMobile();
		automobile.setAutomobileBrand("一汽大众");
		automobile.setModifyTime(new Date());
		automobile.setFrameNumber("lbsfasdfasdf24566");
		System.out.println("kai");
		System.out.println(String.valueOf(autoMobileMapper));
		System.out.println("end");
		autoMobileMapper.insert(automobile);
	}
	
	public static void main(String[] args) {
		Test a=new Test();
		a.insert();
	}
}
