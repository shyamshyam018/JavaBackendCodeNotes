package com.junit.learning;

public class generateArray {
	public int[] genArr(int n) {
		int res[] = new int[n];
		for(int i = 1 ; i <= n ; i++) {
			res[i-1] = i;
		}
		return res;
	}
}
