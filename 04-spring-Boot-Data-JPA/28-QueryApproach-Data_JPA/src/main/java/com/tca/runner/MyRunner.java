package com.tca.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
	
	
	public static void printStudent(List<Student> students)
	{
		for(Student s:students)
		{
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
	    // Test Case=findByGender
     List<Student> list= service.findByGender(Gender.MALE);
     if(list.isEmpty())
     {
    	 System.out.println("No Student Found for Given Gender  ");
     }
     else
     {
    	    System.out.println("Gender Wise LIst of Student");
    	    MyRunner.printStudent(list);
     }
       
 */  
	
	 //findByBirthDate
	
	List<Student> list =
	        service.findByBirthDate(LocalDate.of(2002, 05, 15));

	if (list.isEmpty()) {
	    System.out.println("No Student Found for Given Birth Date");
	} else {
	    System.out.println("Birth Date Wise List of Students");
	    MyRunner.printStudent(list);
	  }
	
}
}
	


