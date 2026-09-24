package com.tca.bean;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {

	public WelcomeBean() {
		
		System.out.println("WelcomeBean is Created");
	}
	
	public void print()
	{
		System.out.println("Service of Welcome");
	}
	
	

}
