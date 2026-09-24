package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App {
    public static void main(String[] args) {
    
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	
    	WelcomeBean b=(WelcomeBean)context.getBean("wc");
    	
    	System.out.println(b.getId());
    	System.out.println(b.getMessage());
    	
    }
}
