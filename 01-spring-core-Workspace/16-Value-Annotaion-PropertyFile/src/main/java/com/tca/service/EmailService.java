package com.tca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Value("${smpt.host}")
	private String smtpHost;
	
	@Value("${smpt.port}")
	private int smtpPort;
	
	@Value("${to.address}")
	private String toAddress;
	
	@Value("${from.address}")
	private String fromAddress;
	
	
	public void sedMail()
	{
		System.out.println("Email send to :"+toAddress);
		System.out.println("From :"+fromAddress +" Via :"+smtpHost +":"+smtpPort);
	}
	

}
