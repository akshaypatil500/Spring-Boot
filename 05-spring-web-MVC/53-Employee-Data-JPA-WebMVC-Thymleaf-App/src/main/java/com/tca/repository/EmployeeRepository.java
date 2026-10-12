package com.tca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.tca.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	   //FindAll()

}
