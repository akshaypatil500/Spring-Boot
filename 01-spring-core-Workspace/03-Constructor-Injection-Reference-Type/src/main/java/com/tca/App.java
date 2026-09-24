package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.Address;
import com.tca.bean.Customer;

public class App {
    public static void main(String[] args) {
    
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	
    Customer customer =(Customer)context.getBean("customer");
    System.out.println(customer.getCustomerId());
    System.out.println(customer.getCustomerName());
    System.out.println(customer.getAddress().getCity());
    System.out.println(customer.getAddress().getPincode());
    
    Address address=(Address)context.getBean("addr");
    System.out.println(address.getCity());
    System.out.println(address.getPincode());


    
    }
}
