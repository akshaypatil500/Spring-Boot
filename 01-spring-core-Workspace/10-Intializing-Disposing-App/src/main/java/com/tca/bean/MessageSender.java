package com.tca.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageSender implements InitializingBean,DisposableBean
{

	 private String serverIP;
	 private String serverPort;
	 
	 
	 public String getServerIP() {
		 return serverIP;
	 }
	 
	 public void setServerIP(String serverIP) {
		 this.serverIP = serverIP;
		 System.out.println("Server IP is Set :"+serverIP);
	 }
	 
	 public String getServerPort() {
		 return serverPort;
	 }
	 
	 public void setServerPort(String serverPort) {
		 this.serverPort = serverPort;
		 System.out.println("Server Port is Set :"+serverPort);

	 }

	 @Override
	 public void afterPropertiesSet() throws Exception {
			System.out.println("Connecting Server ["+serverIP+"] with PortIP ["+serverPort+"]");

	 }
	 
	 @Override
	 public void destroy() throws Exception {
			System.out.println("Disconnecting Server ["+serverIP+"] with PortIP ["+serverPort+"]");

	 }
	 
	 public void myInit()
	 {
			System.out.println("Custome Init-Method-Connecting Server ["+serverIP+"] with PortIP ["+serverPort+"]");

	 }
	 
	 public void myDestroy()
	 {
			System.out.println("Custome Init-Method-Disconnecting Server ["+serverIP+"] with PortIP ["+serverPort+"]");

	 }

	 public void send()
	 {
		 System.out.println("Sending Message.......");
	 }
	
	 
	 
	 
	 
	 
}
