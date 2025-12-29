package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class generateArrayTest {
	generateArray ga = new generateArray();
	@Test
	void generateArrayTest() {
		int arr[] = ga.genArr(10);
		int exp[] = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(arr,exp,()->"JUnit for array-equals failed");
	}

}
