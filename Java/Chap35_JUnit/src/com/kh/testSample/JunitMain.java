package com.kh.testSample;

import static org.junit.Assert.*; //import 일일이 하기 귀찮앙

import org.junit.Test;

public class JunitMain {

	//문자열 비교 테스트
	@Test
	public void testStringEqual() {
		String expected = "Hello, World!"; //예상값
		String actual = "Hellow, World!";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStringInEqual() {
		String expected = "Hello, Java!";
		String actual = "Hello, World!";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testArrayEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual);
		}
	
	@Test
	public void tsetArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2 ;
		double actual = 0.3;
		assertEquals(expected, actual,0.001); // 부동소수점 비교 (오차범위지정)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected, actual,0.001); 
		// 부동소수점이 다르다는 것을 검증 (오차범위 지정)	
		}

}