package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod { //extend로 상속받기

	public static void main(String[] args) {
		
		//입력받은 값으로 어쩌구하는 계산기
		
		//이중상속(상속의 상속..)에 관한 이야기
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 숫자 두 개를 입력하세요~ \n");
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		//이중상속(상속의 상속..)에 관한 이야기
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("add = " + cal.add());
		System.out.println("sub = " + cal.substract());
		System.out.println("mul = " + cal.multiply());
		System.out.println("div = " + cal.divide());
		System.out.println("mod = " + cal.mod(num1,num2));//왜안될까..
		
		
		/**
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 숫자 두 개를 입력하세요~ \n");
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		CalculatorForMod cal = new CalculatorForMod();
		
		int result1 = cal.add();
		int result2 = cal.substract();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		//int result5 = mod(cal.num1, cal.num2);
		
		System.out.println("Add : " + result1);
		System.out.println("Sub : " + result2);
		System.out.println("Mul : " + result3);
		System.out.println("Div : " + result4);
		
		//System.out.println("Mod : " + result5);
		  
		 **/
		 

	}

}