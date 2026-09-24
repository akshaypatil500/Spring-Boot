package com.tca.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetBean {
	/*
     @Autowired	
	 private WelcomeBean wb;
    */
	
	 private WelcomeBean wb;
	
	 /*
     @Autowired	
	 public GreetBean(WelcomeBean wb)
	 {
		 this.wb=wb;
  	   System.out.println("GreetBean Object is Created Using Constructor Injection");

	 }
    */
     @Autowired	
	 public void setWb(WelcomeBean wb) {
			this.wb = wb;
		  	  System.out.println("GreetBean Object is Created Using Setter Injection");

		}
	 
     public GreetBean()
     {
    	   System.out.println("GreetBean Object Created");
     }
     
    

	 public void greet()
     {
    	   wb.print();
     }
	 
	 

}
