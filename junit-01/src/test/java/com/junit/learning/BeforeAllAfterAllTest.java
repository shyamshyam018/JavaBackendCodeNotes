package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class BeforeAllAfterAllTest {
	BeforeAllAfterAll bafa;
	BeforeAllAfterAllTest(){
		System.out.println("Constructor is activated");
	}
	@BeforeAll
	static void init() {
		System.out.println("BeforeAll is activated");
	}
	@BeforeEach
	public void create() {
		bafa = new BeforeAllAfterAll();
		System.out.println("BeforeEach is activated"); 
	}
	@Test
	public void v1() {
		assertEquals(5,5);
		System.out.println("Test1 is activated");
	}
	@Test
	public void v2() {
		assertEquals(10,10);
		System.out.println("Test2 is activated");
	}
	@AfterEach
	public void destroy() {
		bafa = null;
		System.out.println("AfterEach is activated");
	}
	@AfterAll
	static void deinit() {
		System.out.println("AfterAll is activated");
	}

}
