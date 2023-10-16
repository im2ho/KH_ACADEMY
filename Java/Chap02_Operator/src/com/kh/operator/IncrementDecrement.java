package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// 3. 증감연산자(Increment & Decrement): 변수의 값을 1씩 증가시키거나 감소시킬 때 사용
		// 1) 전위 증감 연산자 (++x , --x) 
		// 2) 후위 증감 연산자 (x++ , x--)
		
		/* 1) 전위 증감 : ++ 항의 값에 1을 더한다. 
		 
		   ex) val = ++num; //num의 값이 1 증가한 후 val 변수에 대입
		       val = --num; //num의 값이 1 감소한 후 val 변수에 대입
		 */
		
		int val, val2;
		int num1 = 10;
		val = ++num1; //num의 값이 1 증가한 후, val 변수에 대입을 하기 때문에 11이 대입됨
		System.out.println(val);
		
		val2 = --num1; //num의 값이 1 감소한 후 val 변수에 대입
		System.out.println(val2);
		

		 // 2) 후위 증감 연산자 : ++ 항의 값에 1을 더한다
		 
		  
		int val3,val4;
		int num2 = 10;
		System.out.println("num2의 값 : " + num2);
		val3 = num2++; //val3 변수에 기존 num3 값을 대입한 후 num
		// 1번 val3 = num2 값 추가하자
		// 2번 num2 ++ 1 추가하자 > num2 =11
		System.out.println("val3 : " + val3);
		System.out.println("num2의 값 : " + num2);
		
		val4 = num2--;
		System.out.println("val4 : " + val4);
		System.out.println("num2의 값 : " + num2);

	}

}
