package com.junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class CodePerformanceTest {
	CodePerformance cp = new CodePerformance();
	@Test
	void CodePerformanceTest() {
		int arr[] = {4,2,1,3};
		assertTimeout(Duration.ofMillis(5),()->cp.codePfr(arr));
	}

}
