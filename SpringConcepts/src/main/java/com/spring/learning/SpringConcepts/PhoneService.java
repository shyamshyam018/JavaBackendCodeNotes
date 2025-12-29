package com.spring.learning.SpringConcepts;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component("phoneService")
public class PhoneService implements MessageService {
	public void send(String message) {
		System.out.println(">>> Alerting through Phone : " + message);
	}
}
