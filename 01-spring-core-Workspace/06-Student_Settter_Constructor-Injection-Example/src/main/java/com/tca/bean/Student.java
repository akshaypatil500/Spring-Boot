package com.tca.bean;

public class Student {
	
	private int rno;
	private String name;
	private double fees;
	private int passportId;
	
	public Student(int rno, String name, double fees) {
		super();
		this.rno = rno;
		this.name = name;
		this.fees = fees;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	
	public int getPassportId() {
		return passportId;
	}

	public int getRno() {
		return rno;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}
	
	

}
