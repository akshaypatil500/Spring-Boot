package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ServiceA;




public class App {
    public static void main(String[] args) {


    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    ServiceA s=(ServiceA)context.getBean("sa");
    
    System.out.println(s.getMessage());
    
    System.out.println("Byee");
    	
    //((ClassPathXmlApplicationContext)context).close();
    	
      
  
    }
}
