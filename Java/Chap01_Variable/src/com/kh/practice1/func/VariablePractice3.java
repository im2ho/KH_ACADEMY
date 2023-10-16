package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		
		//키보드로 가로, 세로 값을 실수형으로 입력 받아
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		System.out.print("가로의 길이를 입력하세요 :");
		width = sc.nextDouble();
		System.out.print("세로의 길이를 입력하세요 :");
		height = sc.nextDouble();
		
		System.out.println("가로 : " + width + "\n세로 : " + height);
	}

}