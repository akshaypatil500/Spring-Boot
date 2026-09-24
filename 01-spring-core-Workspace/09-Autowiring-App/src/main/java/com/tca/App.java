package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ExcelReportCreator;
import com.tca.bean.ReportManager;

class App {
    public static void main(String[] args) {
   
    	  ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	  
    	  ReportManager rm=(ReportManager)context.getBean("reportManager");
    	 
    	  rm.printReport();
    	  
    	  /*
    	   Using Setter 
    	   ReportCreator reportCreator = new ExcelReportCreator();

       ReportManager rm = new ReportManager();

       rm.setReportCreator(reportCreator);
       
       =========================================================
         Using Constructor
       
       ReportCreator reportCreator = new ExcelReportCreator();

       ReportManager rm = new ReportManager( reportCreator);

           */

    }
}
