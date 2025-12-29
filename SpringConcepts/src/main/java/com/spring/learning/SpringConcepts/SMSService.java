package com.spring.learning.SpringConcepts;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component("smsService")
public class SMSService implements MessageService{
	public void send(String message) {
		System.out.println(">>> Sending SMS : " + message);
	}
}
