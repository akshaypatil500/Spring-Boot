package com.tca.entity;

public enum Gender {
	
	MALE("M",100),
	FEMALE("F",200);
	
	private String value;
	private int code;
	
	private Gender(String value,int code)
	{
		this.value=value;
		this.code=code;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public int getCode()
	{
		return code;
	}

}
