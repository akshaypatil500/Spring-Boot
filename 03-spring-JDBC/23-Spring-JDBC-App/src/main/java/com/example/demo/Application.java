package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class Application {

	private final StudentRepository studentRepository;

	Application(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository sr= context.getBean(StudentRepository.class);
		
		/*
		 //Test Case - INSERT
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Records");
		
		System.out.println("Enter Rno");
		int rno=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		
		System.out.println("Enter Percentage");
		double per=sc.nextDouble();
		
		System.out.println("Enter City");
		String city=sc.next();
		
		Student s=new Student(rno,name,per,city);
		int status=sr.saveStudent(s);
		if(status==1)
		{
			System.out.println("Record Inserted successfully");
		}
		else
		{
			System.out.println("Record not Inserted");
		}
		*/
		
		/*
		//Test Case - Delete
		
		int affected=sr.deleteStudent(103);
		if(affected==0)
		{
			System.out.println("Unable to Delete Record"+affected);
		}
		else
		{
			System.out.println("Record Deleted SUccessfully"+affected);
		}
		
		sr.deleteStudent("mumbai");
		
		*/
		/*
		Student s=new Student();
		s.setRno(101);
		s.setName("AAA");
		s.setPer(67);
		s.setCity("Pune");
		int status=sr.updateStudent(s);
		if(status==0)
		{
			System.out.println("Unable to update");
		}
		else
		{
			System.out.println("Record updated");
		}
		*/
		
//		 Map<String,Object>map=sr.fingById(101);
//		 System.out.println(map);
		
		List<Map<String,Object>> list=sr.findAll();
		
		for(Map<String, Object> data:list)
		{
			System.out.println(data);
		}
		System.out.println(list);
		
	}

}
