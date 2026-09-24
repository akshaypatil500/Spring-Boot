package com.tca.bean;

public class Customer {          //Dependent Class
	
	private int customerId;
	private String customerName;
	
	private Address address;     //Dependency Object

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {  //This all are Setter 
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
