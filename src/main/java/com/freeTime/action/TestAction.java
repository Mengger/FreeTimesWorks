package com.freeTime.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.freeTime.service.AutoMobileService;
import com.opensymphony.xwork2.ActionSupport;


@Component("testAction")
@Scope("prototype")
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AutoMobileService autoMobileService;

	public String execute() {
		System.out.println("come on!!!!!!!!");
		autoMobileService.insert();
		return "success";
	}

}
