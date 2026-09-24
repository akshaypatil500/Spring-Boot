package com.tca.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;
import com.tca.service.StudentServiceImpl;

@Component
public class MyRunner implements ApplicationRunner {

	private final StudentServiceImpl studentService;
	@Autowired
	private StudentService service;

	MyRunner(StudentServiceImpl studentService) {
		this.studentService = studentService;
	}

	public static void printStudent(List<Student> students) {
		for (Student s : students) {
			System.out.println("Roll No: " + s.getRno());
			System.out.println("Name: " + s.getName());
			System.out.println("Percentage: " + s.getPer());
			System.out.println("Gender: " + s.getGender());
			System.out.println("Birth Date: " + s.getBirthDate());

			System.out.println("-".repeat(50));
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
    /*
		   List<Student> list=service.fetchAllByGreterThanPerAndGender(70.0, Gender.MALE);
		   System.out.println(list);
	*/	   
		   
		 // service.modifyStudent("Akki", 102);
		
		
/*		
		 List<Object[]> ob=service.fetchNameAndGender("Akki", Gender.MALE);
		 
		 for(Object[] data:ob)
		 {
			 for(Object sob:data)
			 {
				 System.out.print(sob+" ");
				
			 }
			

			 System.out.println();
			 System.out.println("--".repeat(60));
		 }
*/
		  List<Object[]> list =service.countByGender();
		  
		  for(Object[] data:list)
		  {
			  System.out.println("Gender                  :"+data[0]);
			  System.out.println("No. of Canditates       :"+data[1]);
				 System.out.println("--".repeat(60));


		  }
		   
		   
		   
		   
	}
}
