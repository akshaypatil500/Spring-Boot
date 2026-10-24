package com.tca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tca.entity.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Transactional
	@Query(value="update employee set salary=?,department=? where id=?",nativeQuery=true)
	public int partialUpdateEmployee(Double salary,String department,Integer id);

}
