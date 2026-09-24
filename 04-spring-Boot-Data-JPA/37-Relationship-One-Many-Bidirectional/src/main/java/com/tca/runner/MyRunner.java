package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.service.CustomerService;
import com.tca.service.OrdersService;
import com.tca.serviceimpl.OrdersServiceImpl;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner {

	private final OrdersServiceImpl OrderService;

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrdersService ordersService;

	MyRunner(OrdersServiceImpl OrderService) {
		this.OrderService = OrderService;
	}
	
	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {
		
/*
		Orders o1=new Orders();
		o1.setOrderId(101L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		
		Orders o2=new Orders();
		o2.setOrderId(102L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.CANCELLED);
		
		Customer c=new Customer();
		c.setName("BBB");
		c.setPhone(9999l);
	
		
		c.setOrders(Arrays.asList(o1,o2));
		
		
		o1.setCustomer(c);
		o2.setCustomer(c);
		
		customerService.save(c);
		
*/		

		
		
/*
		Customer c1=customerService.fetchCustomerBYID(1L);
		Orders o1=new Orders();
		o1.setOrderId(101L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		//o1.setCustomer(c1);
		
		OrderService.saveOrder(o1, c1);
		
		Orders o2=new Orders();
		o2.setOrderId(102L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.CANCELLED);
		//o2.setCustomer(c1);
		
		ordersService.saveOrder(o2,c1);
		 
*/

/*
		Customer c=customerService.fetchCustomerBYID(1L);
		
		System.out.println("===== CUSTOMER DETAILS =====");
		System.out.println("Customer ID    : " + c.getCid());
		System.out.println("Customer Name  : " + c.getName());
		System.out.println("Customer Phone : " + c.getPhone());
		
		System.out.println("--------------------------------------".repeat(100));
		
		System.out.println("\n===== ORDER DETAILS =====");

		for (Orders o : c.getOrders())
		{
		    System.out.println("Order ID        : " + o.getOrderId());
		    System.out.println("Date Purchased  : " + o.getDatePurchased());
		    System.out.println("Order Status    : " + o.getOrderStatus());
		    System.out.println("Customer ID     : " + o.getCustomer().getCid());
		    System.out.println("----------------------------");
		}
		
*/
		
/*		
		
		Orders o = ordersService.fetchOrderById(101L);

		System.out.println("===== ORDER DETAILS =====");
		System.out.println("Order ID        : " + o.getOrderId());
		System.out.println("Date Purchased  : " + o.getDatePurchased());
		System.out.println("Order Status    : " + o.getOrderStatus());

		Customer c = o.getCustomer();

		System.out.println("\n===== CUSTOMER DETAILS =====");
		System.out.println("Customer ID     : " + c.getCid());
		System.out.println("Customer Name   : " + c.getName());
		System.out.println("Customer Phone  : " + c.getPhone());

			
*/
	
		ordersService.deleteOrderById(101L);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
