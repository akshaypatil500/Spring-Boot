package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App {
    public static void main(String[] args) {

    	 //Step 1.Creating and Starting Container
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      
      //Step 2:Get the Object of Bean
   /*   
      Object ob=context.getBean("wc"); //TypeCating is required
      WelcomeBean wb=(WelcomeBean)ob;
    */   
      WelcomeBean wb2=context.getBean(WelcomeBean.class); // No Typecating is required
 
      
      
      //Step 3. Call bean Method /Bussiness logic
      String msg=wb2.getMessage();
      
      System.out.println(msg);
    }
}
