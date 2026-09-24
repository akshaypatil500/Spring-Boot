package com.tca.bean;

public class ServiceC {
	
	private ServiceA servicea;

	public ServiceC(ServiceA servicea) {
	
		this.servicea = servicea;
	}
	
	public void print()
	{
		System.out.println("ServiceC : Find Mehtod");
	}
	

}
