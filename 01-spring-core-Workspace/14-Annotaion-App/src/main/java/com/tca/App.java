package com.tca;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.model.Student;
import com.tca.service.StudentService;

public class App {
	public static void main(String[] args) {

		
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        
         StudentService service=context.getBean(StudentService.class);
        
//        Student s=service.getStudentById("SB-1");
//        
//        if(s==null)
//        {
//        	    System.out.println("No Student Found");
//        }
//        else
//        {
//        	    System.out.println("Student Data :"+s);
//        }
        
         Map<String ,Student> s=service.getAllStudent();
         
         

	}
	

}

