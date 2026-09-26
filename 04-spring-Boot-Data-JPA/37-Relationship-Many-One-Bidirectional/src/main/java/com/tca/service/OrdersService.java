package com.tca.service;

import com.tca.entity.Customer;
import com.tca.entity.Orders;

public interface OrdersService {
	
	public Orders fetchOrderById(Long oid);
	
	public Orders updateOrderStatus(Orders order);
	
	public Orders saveOrder(Orders order,Customer customer);
	
	public void deleteOrderById(Long oid);
}
