package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.Student;

public class App {
    public static void main(String[] args) {
    
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	
    	Student s=(Student)context.getBean("student");
    	
    	System.out.println("Student RollNo :"+s.getRno());
    	System.out.println("Student Name   :"+s.getName());
    	System.out.println("Student Fees   :"+s.getFees());
    	
    	if (s.getPassportId() != 0) {
    	    System.out.println("Student Passport : " + s.getPassportId());
    	    
    	} else {
    	    System.out.println("Passport ID not available");
    	}


    	
    }
}
