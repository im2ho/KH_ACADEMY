package com.kh.scannersample;

import java.util.Scanner; //누가 만든거 뽀려오기

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt(); // sc.nextInt(): 정수만 받는 next 형태, 공백은 받지X
		System.out.println("내 나이는 " + age + "살 입니다.");
		
		String name;
		String phoneNumber;
		
		System.out.print("이름을 입력해 주세요 : ");
		name = sc.next(); // string(문자열은) sc.next();로 받기
		
		System.out.print("번호를 입력해 주세요 : ");
		phoneNumber = sc.next(); // phoneNumber를 int로 받을 시에는 하이픈(-)넣지 않을 것
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " + phoneNumber + "입니다.");
		*/
		
		//내 취미와 내가 좋아하는 음식과 내 주소 출력하기
		
		System.out.print("취미를 입력하세요 : ");
		String favor = sc.next();
		
		System.out.print("좋아하는 음식을 입력하세요 : ");
		String food = sc.next();
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.next();
		// nextline: 엔터치기 전까지 출격
		System.out.println("내 취미는 " + favor + "이고, 좋아하는 음식은 " + food +",\n사는 곳은 " + address + "입니다.");
	}
 
}
