/*
@Component - Registers the class as bean in Spring IOC Container , making it ready for 
			 lifecycle management (object creation and deletion)
			 
@Order - When injecting the bean into list , this specifies the order in which it will be injected
*/



package com.spring.learning.SpringConcepts;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component("notifyService")
public class EmailService implements MessageService{
	public void send(String message) {
		System.out.println(">>> Sending Email : " +  message);
	}
}
