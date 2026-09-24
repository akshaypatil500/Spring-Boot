package com.tca.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware , ApplicationContextAware,InitializingBean,DisposableBean{
	
	private String message;
	
	public ServiceA()
	{
		System.out.println("1) Creation of Bean");
	}
	
	public void setMessage(String message)
	{
		this.message=message;
		System.out.println("2) Injection : Setter Injection");
		
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

	@Override
	public void afterPropertiesSet() throws Exception {

        System.out.println("Intializing Bean : afterPropertiesSet()");		
	}
	
	public void myInit()
	{
        System.out.println("Intializing Bean : Custome Init Method");		
	}

	
	@Override
	public void destroy() throws Exception {

		System.out.println("Disposing Bean : destroy()");
	}
	public void myDestroy()
	{
        System.out.println("Disposing Bean : Custome destroy Method");		

	}
	
	public void printMessage()
	{
		System.out.println("Service : Print <essage -->"+ message);
	}

	

		
	

}
