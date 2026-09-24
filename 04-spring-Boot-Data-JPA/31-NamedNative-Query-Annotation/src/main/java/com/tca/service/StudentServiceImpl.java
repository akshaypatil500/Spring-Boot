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
	public List<Student> fetchAllByGreterThanPerAndGender(Double per, Gender gender) {
		
		return repo.findByGreterThanPerAndGender(per,gender);
	}

	@Override
	public void modifyStudent(String name, Integer rno) {
		
		repo.updateByName(name, rno);
		
	}

	@Override
	public List<Object[]> fetchNameAndGender(String name, Gender gender) {
		
		return repo.findByGenderAndName(name, gender);
	}

	@Override
	public List<Object[]> countByGender() {
		
		return repo.countByGender();
	}

	

   	


	}

