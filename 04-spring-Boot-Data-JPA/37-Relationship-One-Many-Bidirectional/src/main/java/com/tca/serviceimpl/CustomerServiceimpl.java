package com.tca.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Customer;
import com.tca.entity.Orders;
import com.tca.repository.CustomerRepository;
import com.tca.service.CustomerService;

@Service(value="CustomerService")
public class CustomerServiceimpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer c) {
		
		return customerRepository.save(c);
	}

	@Override
	public Customer fetchCustomerBYID(Long id) {
		
		Optional<Customer> ob= customerRepository.findById(id);
		if(ob.isPresent()) {
			Customer c=ob.get();
             return c;	
		}
		else {
			return null;
		}
		
		
		//return customerRepository.findById(id).get();
	}

	

	@Override
	public void deleteCustomerByID(Long cid) {

		customerRepository.deleteById(cid);
	}

	

}
