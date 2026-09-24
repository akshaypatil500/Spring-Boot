package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ServiceA;




public class App {
    public static void main(String[] args) {


    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    ServiceA s=(ServiceA)context.getBean("sa");
    s.printMessage();

    context.close();//Shutting down Container
    
    System.out.println("********** END OF APPLICATION **********");
    	
      
  
    }
}
