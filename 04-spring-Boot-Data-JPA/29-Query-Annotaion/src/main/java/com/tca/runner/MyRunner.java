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
		
		//Test Case get All Studdent
/*
		  List<Student> s=service.fetchAllStudent();
		   printStudent(s);
		   
*/
		
/*		
		//Test Case findPerRange
		
		 List<Student> s=service.findPerRangeStudent(70.0 , 80.0);
		 printStudent(s);
		 
*/		
		
/*		
		 List<Object[]> data=service.findGenderNamePerStudent(78.0, Gender.FEMALE);
		 
		 for(Object[] ob:data)
		 {
			 
			 System.out.print(ob[0]+" ");
			 System.out.print(ob[1]+" ");
			 System.out.print(ob[2]+" ");
 
//			 for(Object object:ob)
//			 {
//				 System.out.print(object+" ");
//			 }
			 
			 System.out.println();
		 }
*/
		
/*		
		//Test Code for Delete Using @Modifying and @Transcational
		
		service.removeByPerAndGender(78.0, Gender.MALE);
		System.out.println("Recorded is Deleted Successfully");
		
*/
		
/*		
		//Test Code For Update
		
		Integer rno=service.updatePer(99.99, 102);
		System.out.println("Updated Student-"+rno);
*/
		
		
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
