package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {

	//ArrayPractice ap1 = new ArrayPractice(6);
	ArrayPractice ap2 = new ArrayPractice();
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {1,2,3,4,5,6,7,8,9,10};
		//¹è¿­¿ë Å×½ºÆ® ¸í·É¾î...^^ ½ËÆÈ...
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPractice2() {
		String expected = "oiiaiooiiiaio";
		String actual = "oiiaiooioiaio";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testPractice3() {
		int[] arr = {1,2,3,4,5,6};
		assertArrayEquals(arr, ap2.practice12());
	}
	
	@Test
	public void testPractice4() {
		String[] fruits = {"»ç°ú","±Ö","Æ÷µµ","º¹¼þ¾Æ","Âü¿Ü"};
		assertArrayEquals(fruits, ap2.practice4());
	}
	
}