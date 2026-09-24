package com.tca.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware,ApplicationContextAware {
	
	private String message;
	
	public void setMessage(String message)
	{
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

           System.out.println("Context : Spring Container");		
	}

	@Override
	public void setBeanName(String name) {
		
		System.out.println("Bean Name "+name);
		
	}
	
	

}
