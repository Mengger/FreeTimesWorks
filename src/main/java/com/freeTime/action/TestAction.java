package com.freeTime.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("come on!!!!!!!!");
		return "success";
	}

}
