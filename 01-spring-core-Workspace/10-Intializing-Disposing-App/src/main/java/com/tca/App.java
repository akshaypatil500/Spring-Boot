package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.MessageSender;



public class App {
    public static void main(String[] args) {


    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	MessageSender ms=(MessageSender)context.getBean("ms");
    	ms.send();
    	
    	ClassPathXmlApplicationContext cp=(ClassPathXmlApplicationContext) context;
    	cp.close();
    	
    //((ClassPathXmlApplicationContext)context).close();
    	
      
  
    }
}
