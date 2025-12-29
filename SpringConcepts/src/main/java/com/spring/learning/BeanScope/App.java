package com.spring.learning.BeanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.learning.BeanScope.AppConfig;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SingletonCounter s1 = context.getBean(SingletonCounter.class);
		s1.increment();
		SingletonCounter s2 = context.getBean(SingletonCounter.class);
		System.out.println("Singleton Count (s2): " + s2.getCount());
		PrototypeCounter p1 = context.getBean(PrototypeCounter.class);
		p1.increment();
		PrototypeCounter p2 = context.getBean(PrototypeCounter.class);
		System.out.println("Prototype Count (p2): " + p2.getCount());
		context.close();
	}
}
