package com.tca.service;

import java.util.List;


import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService {
	
	  
	  public List<Student> fetchAllByGreterThanPerAndGender(Double per,Gender gender);
	  
	  public void modifyStudent(String name,Integer rno);
	  
	  public List<Object[]> fetchNameAndGender(String name,Gender gender);
	  
	  public List<Object[]> countByGender();
	  
	  
	


}
