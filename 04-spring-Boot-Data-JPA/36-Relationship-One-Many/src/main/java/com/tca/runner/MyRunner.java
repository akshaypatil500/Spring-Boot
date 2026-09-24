package com.tca.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Customer;
import com.tca.entity.OrderStatus;
import com.tca.entity.Orders;
import com.tca.service.CustomerService;
import com.tca.service.OrdersService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrdersService ordersService;
	
	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {
		
/*
		Customer c=new Customer();
		c.setName("BBB");
		c.setPhone(9999l);
		
		Orders o1=new Orders(103l,LocalDate.now(),OrderStatus.DELIVERED);
		Orders o2=new Orders(102l,LocalDate.now(),OrderStatus.PENDING);
		
		List<Orders> orders=new ArrayList<>();
		
		orders.add(o1);
		orders.add(o2);
		
		c.setOrders(orders);
		
		customerService.save(c);
*/

		
/*		
		Customer c=customerService.fetchCustomerBYID(1L);
		System.out.println("Customer "+c);
		
		System.out.println("--------------------------------------");
		
		List<Orders> orders=c.getOrders();
		System.out.println(orders);
		
	  //  System.out.println(c.getOrders().get(0).getOrderId());
*/
	
/*		
		Customer c=new Customer();
		c.setName("BBB");
		c.setPhone(89567l);
		
		customerService.save(c);
*/
		
/*	
		Customer c = customerService.fetchCustomerBYID(2L);

		Orders o1 = new Orders();
		o1.setOrderId(103L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.PENDING);

		List<Orders> orderList = new ArrayList<>();
		orderList.add(o1);

		c.setOrders(orderList);

		customerService.save(c);
		
	
*/
/*		
		Customer c = customerService.fetchCustomerBYID(2L);
		
		customerService.updateOrder(c.getCid(),new Orders(103l,LocalDate.now(),OrderStatus.DELIVERED));
 
*/
/*
        // Arrays.asList() returns a fixed-size List,
        // so use new ArrayList<>() to allow Hibernate to modify the collection during save/merge.
        
    
		Customer c = customerService.fetchCustomerBYID(2L);
		c.setOrders(
				Arrays.asList(new Orders(103l,LocalDate.now(),OrderStatus.DELIVERED))

				);
		c=customerService.save(c);
		
		
		
		// use LIke 
		c.setOrders(
        new ArrayList<>(
        Arrays.asList(
            new Orders(101L, LocalDate.now(), OrderStatus.DELIVERED)
        )
    )
);
*/
		//Delete Customer with Order
		//customerService.deleteCustomerByID(1L);

/*
		Customer c=customerService.fetchCustomerBYID(2L);
		c.setOrders(
				new ArrayList<>(
				Arrays.asList(new Orders(104L, LocalDate.now(), OrderStatus.DELIVERED)
				)
			)
		);
		
		customerService.save(c);
*/
		
		
	   Orders o=ordersService.fetchOrderById(101L);  //   101 | 2026-09-22     | DELIVERED |       3
	   o.setOrderStatus(OrderStatus.CANCELLED);
	   
	   ordersService.updateOrderStatus(o);           //  101 | 2026-09-22     | CANCELLED |       3
		
		
		
		

	}		
		
		
}
