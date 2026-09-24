package com.tca.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
	public Optional<Student> fetchById(Integer rno) {

		return  repo.findById(rno);
	}

	@Override
	public List<Student> fetchAll() {
         
		return (List)repo.findAll();
	}

	@Override
	public List<Student> findByGender(Gender gender) {
		
		return repo.findByGender(gender);
	}

	@Override
	public List<Student> findByBirthDate(LocalDate d) {
		
		return repo.findByBirthDate(d);
	}


	}

