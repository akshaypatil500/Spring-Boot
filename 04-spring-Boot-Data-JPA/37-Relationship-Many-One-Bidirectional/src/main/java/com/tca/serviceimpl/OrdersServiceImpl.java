package com.tca.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Customer;
import com.tca.entity.Orders;
import com.tca.repository.OrderRepository;
import com.tca.service.OrdersService;

@Service(value="OrderService")
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Orders fetchOrderById(Long oid) {
		return orderRepository.findById(oid).get();
	}

	@Override
	public Orders updateOrderStatus(Orders order) {
		
		return orderRepository.save(order);
	}

	@Override
	public Orders saveOrder(Orders order, Customer customer) {
		
		order.setCustomer(customer);
		return orderRepository.save(order);
	}


	@Override
	public void deleteOrderById(Long oid) {
	
		orderRepository.deleteById(oid);
		
	}

}
