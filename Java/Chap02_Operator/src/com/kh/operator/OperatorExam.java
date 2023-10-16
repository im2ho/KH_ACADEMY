package com.kh.operator;

public class OperatorExam {
	public static void main(String[] args) {
		//1. 전위 증가 연산자
		/*
		 전위 증가 연산자는 변수 1을 증가시킨 후 그 값을 다시 변수에 할당
		 i의 값을 1 증가시키고 그 값을 다시 i에 할당
		 */
		
		int i =5;
		i = ++i;
		System.out.println("i = ++i: " + i);
		
		//2. 후위 증가 연산자
		/*
		 변수의 현재 값을 사용한 후 변수 1을 증가
		 i의 현재 값을 i에 할당하고, 그 후에 i의 값을 1증가 시킨다. (할당 = 현재값 --> i 변화X)
		 */
		
		int r = 5;
		r = r++;
		System.out.println("r = r++: " + r);
		
		int a =5;
		++a;
		System.out.print("++a: a" + a);
	}

}
