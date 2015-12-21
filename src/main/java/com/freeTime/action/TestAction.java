package com.freeTime.action;

import com.freeTime.test.Test;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("come on!!!!!!!!");
		Test a=new Test();
		a.insert();
		return "success";
	}

}
