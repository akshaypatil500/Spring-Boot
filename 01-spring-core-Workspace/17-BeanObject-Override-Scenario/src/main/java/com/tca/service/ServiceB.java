package com.tca.service;

import org.springframework.stereotype.Service;

@Service("serviceB")
public class ServiceB {

    public ServiceB() {
        System.out.println("ServiceB constructor called");
    }

}