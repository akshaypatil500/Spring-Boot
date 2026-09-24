package com.tca.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.tca.bean.Student;
import com.tca.repository.StudentRepository;

public class StudentService {

	  @Autowired
	  private StudentRepository repository;
	  
	  public Student getStudentById(String key)
	  {
		  return repository.findById(key);
	  }
	  
	  public Map<String,Student> getAllStudent()
	  {
		  return repository.findAll();
	  }
	  
	  
	  
	  
}
