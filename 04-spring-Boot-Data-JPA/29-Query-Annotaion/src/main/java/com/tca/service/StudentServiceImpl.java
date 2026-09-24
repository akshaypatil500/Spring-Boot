package com.tca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> fetchAllStudent() {

   // return repo.findAllUsingJPQL();
		
		return repo.findAllUsingSQL();
		
	}

	@Override
	public List<Student> findPerRangeStudent(Double start, Double end) {
		// return repo.findPerRangeUsingJPQL(start, end);
		
		return repo.findPerRangeUsingSQL(start, end);	
	}

	@Override
	public List<Object[]> findGenderNamePerStudent(Double per, Gender gender) {
	
		return repo.findGenderNamePer(per, gender);
	}

	@Override
	public void removeByPerAndGender(Double per, Gender gender) {
	
		 repo.deleteByPerAndGender(per, gender);
		
	}

	@Override
	public Integer updatePer(Double per, Integer rno) {
		return repo.updatePer(per, rno);
	}


	


	}

