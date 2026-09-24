package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentService {
	
	  
	  public  List<Student> fetchAllStudent();
	  
	  public  List<Student> findPerRangeStudent(Double start ,Double end);

	  public List<Object[]> findGenderNamePerStudent(Double per,Gender gender);
	  
	  public void removeByPerAndGender(Double per,Gender gender);
	  
	  public Integer updatePer(Double per , Integer rno);
	  
	  
	  
	  
	


}
