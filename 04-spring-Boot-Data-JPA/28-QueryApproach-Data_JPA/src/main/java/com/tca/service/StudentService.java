package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService {
	
	  
	  public Optional<Student> fetchById(Integer rno);//it might return null that is why Optional

	  public List<Student> fetchAll();
	  
	  List<Student> findByGender(Gender gender);
		
	  List<Student> findByBirthDate(LocalDate d);
	  
	  
	  
	  
	  
	


}
