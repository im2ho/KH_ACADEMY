package com.kh.testSample;

import static org.junit.Assert.*; //Assert 밑에 있는 모든 것을 가져오겠어요~
import static org.junit.Assert.assertEquals;

import org.junit.Test; //@Test

public class CalculatorTest {

		@Test //Junit import 필요
		public void testAddition() {
			Calculator cal = new Calculator();
			int result = cal.add(5, 2);
			assertEquals(7, result);
			//예상값과 실제 결과값 비교 (7과 result를 비교해보자~)
		}
		
		@Test
		public void testSubtraction() {
			Calculator cal = new Calculator();
			int result = cal.subtract(8, 3);
			assertEquals(5,result);
			// 5와 result를 비교해보자~
		}


}