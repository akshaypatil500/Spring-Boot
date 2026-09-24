package com.tca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.service.ServiceB;


public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        // Check all bean names
        String[] beanNames = context.getBeanDefinitionNames();

        for(String name : beanNames) {
            System.out.println(name);
        }


        // Get bean by name
        ServiceB obj1 = (ServiceB) context.getBean("serviceB");


        // Get bean by type
        ServiceB obj2 = context.getBean(ServiceB.class);


        // Check same object or not
        System.out.println(obj1 == obj2);


        context.close();
   
    	
      
  
    }
}
