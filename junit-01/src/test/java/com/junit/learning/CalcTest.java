package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {
	Calc c = new Calc();
	@Test
	void testDivideFunc() {
		assertEquals(c.divide(10, 5),2);
	}
	
	@Test
	void testMultiplyFunc()	{
		assertEquals(c.multiply(5, 10) , 50);
	}

}
