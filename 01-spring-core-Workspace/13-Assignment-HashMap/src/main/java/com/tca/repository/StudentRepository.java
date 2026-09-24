package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.tca.bean.Student;

public class StudentRepository {
	
	  @Autowired
	  private Map<String,Student> hm;
	  
	  public Student findById(String StudentId)
	  {
		  return hm.get(StudentId);
	  }

	  public Map<String ,Student> findAll()
	  {
		  return hm;
	  }
}
