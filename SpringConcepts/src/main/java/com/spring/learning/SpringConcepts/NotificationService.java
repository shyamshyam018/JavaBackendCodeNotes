/*
This is where Dependency Injection (DI) actually happens.

@Service - Specialized version of @Component used for business logic

@Autowired - This is the injection point , so when spring creates the NotificationService it looks
			 at its constructor and gives them the list of beans , the emailService and smsService
			 from Warehouse
			 
Inversion of Control (IoC): Notice the NotificationService never says new EmailService(). 
							It simply asks for a "MessageService" and lets Spring provide 
							the implementation.
*/


package com.spring.learning.SpringConcepts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	private final List<MessageService> messageServices;
	
	@Autowired
	public NotificationService(List<MessageService> messageServices) {
		this.messageServices = messageServices;
	}
	
	public void process(String msg) {
		for (MessageService service : messageServices) {
            service.send(msg);
        }
	}
	
}
