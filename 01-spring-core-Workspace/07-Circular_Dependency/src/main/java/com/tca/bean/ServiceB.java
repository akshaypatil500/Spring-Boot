package com.tca.bean;

public class ServiceB {
	
	private ServiceC servicec;

	public ServiceB(ServiceC servicec) {
		
		this.servicec = servicec;
	}
	
	public void show()
	{
		System.out.println("ServiceB : Show");
		servicec.print();
	}

}
