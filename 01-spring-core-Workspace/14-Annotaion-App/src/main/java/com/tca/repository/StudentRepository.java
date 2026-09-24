package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tca.model.Student;

@Repository
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
