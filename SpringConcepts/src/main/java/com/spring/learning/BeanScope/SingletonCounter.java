package com.spring.learning.BeanScope;

import org.springframework.stereotype.Component;

@Component
public class SingletonCounter {
	private int count = 0;
	public void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
