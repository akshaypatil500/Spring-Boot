package com.tca.bean;

public class WelcomeBean {
	
	private int id;
	private String message;
	
	public WelcomeBean(int id,String message)
	{
		this.id=id;
		this.message=message;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	

}
