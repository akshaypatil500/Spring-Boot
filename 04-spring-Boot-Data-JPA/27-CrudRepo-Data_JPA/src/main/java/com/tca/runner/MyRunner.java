package com.tca.runner;

import com.tca.service.StudentServiceImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

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
		
//		LocalDate d=LocalDate.now();
//		LocalDate d2=LocalDate.of(2026, 01,15);
	/*	
	   //Test Case =save()
	   
		Student student =new Student(102,"BBB",89.0,Gender.FEMALE,LocalDate.of(2026,05,4));
        service.save(student);
        System.out.println("Student Data is Saved Successfully"+student);
        
     */ 
		
   /*		
        //Test Case=Update()
		Student student=new Student(101,"AAA",60.0,Gender.MALE,LocalDate.of(2026,8,30));
		student.setPer(66.0);
		student.setName("Sachin");
		
		Student updated=service.update(student);
		System.out.println("Student Updated :"+updated);
	*/	
		
        //Test Case=fetchById()
	/*	
		Optional<Student> s=service.fetchById(101); 
		
		if(s.isPresent())
		{
			Student s1=s.get();
			System.out.println(s1);
			

		}
		else
		{
			System.out.println("No Data Found !!!");
		}

*/
		
	/*
		//Test Case=fetchAll()
		
		 List<Student> list= service.fetchAll();
		 if(list.isEmpty())
		 {
			System.out.println("NO Student is Present"); 
		 }
		 else
		 {
		    MyRunner.printStudent(list);
		 }
     */
		
		
		//Tets Case=deleteById()
	/*	
		if(service.deleteById(102))
		{
			System.out.println("Student Record is Deleted");
		}
		else
		{
			System.out.println("Record is not found !!");
		}
		
 */
		
	/*
		//Test Case = SaveALL()
		
		  Student s1=new Student(102,"BBB",78.0,Gender.MALE,LocalDate.now());
		  Student s2=new Student(103,"CCC",98.0,Gender.FEMALE,LocalDate.of(2024,06,05));
		  
		  List<Student> list=new ArrayList<>();
		  list.add(s1);
		  list.add(s2);
		  
		 service.saveAll(list);
		 

		
		//Test Case =Count()
		
		 Long c=service.count();
		 System.out.println("Number of Entites Availabel "+c);
*/	
		//Test Case = deleteAll()
		

		

	}

}
