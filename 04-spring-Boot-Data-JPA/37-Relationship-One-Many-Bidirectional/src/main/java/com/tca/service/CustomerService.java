package com.tca.service;

import com.tca.entity.Customer;
import com.tca.entity.Orders;

public interface CustomerService {
	
	public Customer save(Customer c);
	
	public Customer fetchCustomerBYID(Long id);
		
	public  void deleteCustomerByID(Long cid);



}
