package com.tca.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired 
	private EmployeeRepository repo;
	
	
	@Override
	public Employee fetchEmployeeById(Integer id) 
	{
		Optional<Employee> opt = repo.findById(id);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
		{
			return null;
		}
	}


	@Override
	public List<Employee> fetchAllEmployee() 
	{
		return repo.findAll();
		
	}

	@Override
	public Employee saveEmployee(Employee emp) 
	{
		
		if(repo.existsById(emp.getId()))
		{
			return null;
		}
		else
		{
			
			return repo.save(emp);
		}	
	}
	
	@Override
	public boolean removeEmployee(Integer id) 
	{
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return true;
		}
		else
		{	
			return false;
		}
	}
	
	@Override
	public Employee updateEmployee(Employee emp) 
	{
	/*	
		try
		{
			// process input - means check all values are present
			  	emp.getEname() != null && 	emp.getSal() > 0
			// If succed then call repo for an employee & return that employee
			// otherwise throw an XYZException
		}
		catch(XYZException e)
		{
			return null;
		}
	*/	
		if( repo.existsById(emp.getId()))
		{
			return repo.save(emp);
		}
		else
		{
			return null;
		}
	}
	
	
	public Employee updateEmployeeById(Map<String,Object> fieldMap, Integer id) 
	{
		if( repo.existsById(id))
		{
			Double sal = (Double) fieldMap.get("sal");   // Object
			Integer deptno = (Integer) fieldMap.get("deptno");
			
			int noOfRowsAffected = repo.partialUpadteEmployee(sal, deptno, id);
			
			if(noOfRowsAffected==0)
			{
				return null;
			}
			else
			{
				return repo.findById(id).get();
			}
			
		}
		else
		{
			return null;
		}
	}
	
}







