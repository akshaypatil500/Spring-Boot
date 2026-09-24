package com.tca.entity;

public class Student {

	int rno;
	String name;
	double per;
	
	Gender gender;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + ", gender=" + gender + "]";
	}

	public Student(int rno, String name, double per, Gender gender) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
		this.gender = gender;
	}

	public Student() {
	}
	
	
		
}
