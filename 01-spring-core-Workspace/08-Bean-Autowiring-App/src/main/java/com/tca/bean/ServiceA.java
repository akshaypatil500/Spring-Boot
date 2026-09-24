package com.tca.bean;

public class ServiceA {
	
	private ServiceB serviceb;
	private ServiceB sB;

	
	
	public  ServiceA()
	{
		System.out.println("0-Arg");
	}
	
	public void setsB(ServiceB sB) {
		this.sB = sB;
		System.out.println("***********sb Injection************");

	}

	public ServiceA(ServiceB serviceb) {
		
		this.serviceb = serviceb;
		System.out.println("***********Constructor Injection************");
	}

	public void setServiceb(ServiceB serviceb) {
		this.serviceb = serviceb;
		System.out.println("**********Setter Injection************");

	}

	
	

	

}
