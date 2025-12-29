package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayReverseExceptionTest {

	@Test
	void genArrExcp() {
		ArrayReverseException aep = new ArrayReverseException();
//		try {
//			int arr[] = {4,3,2,1};
//			int expected[] = {1,2,3,4};
//			for(int x : arr) {
//				System.out.println(x + " ");
//			}
//			assertArrayEquals(expected,aep.arrRevExcp(arr),()->"Failed array sorting");
//			fail();
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		assertThrows(NullPointerException.class,()->aep.arrRevExcp(null));
	}

}
