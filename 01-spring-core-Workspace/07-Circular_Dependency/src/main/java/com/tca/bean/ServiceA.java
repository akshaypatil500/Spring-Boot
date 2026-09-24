package com.tca.bean;

public class ServiceA {
	
	private ServiceB serviceb;
	
	
	public void setServiceb(ServiceB serviceb) {
		this.serviceb = serviceb;
	}



	public void display()
	{
		System.out.println("ServiceA : Display");
		serviceb.show();
	}
	

}
