package com.tca.service;

import com.tca.entity.Orders;

public interface OrdersService {
	
	public Orders fetchOrderById(Long oid);
	
	public Orders updateOrderStatus(Orders order);

}
