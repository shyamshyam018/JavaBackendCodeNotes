package com.junit.learning;

import java.util.Arrays;

public class CodePerformance {
	public int[] codePfr(int arr[]) {
		for(int i = 0 ; i < 10000 ; i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}
