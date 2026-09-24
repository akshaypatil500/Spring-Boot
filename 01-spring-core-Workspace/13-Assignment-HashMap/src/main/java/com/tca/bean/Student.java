package com.tca.bean;

public class Student {

	private String name;
	private String city;
	private double per;
	
	
	public Student(String name, String city, double per) {
	
		this.name = name;
		this.city = city;
		this.per = per;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", per=" + per + "]";
	}



	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public double getPer() {
		return per;
	}
	
	
}
