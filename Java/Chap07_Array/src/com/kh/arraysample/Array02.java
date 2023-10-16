package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		
		/**
		 * 
		// 1. 배열의 길이를 선언
		int[] num = new int[10]; //길이가 10인 배열 선언
		
		// 1~10까지의 반복문을 이용해서
		for(int i = 0; i < num.length ; i++) {
			//순서대로 배열 인덱스에 넣은 후 
			num[i] = i +1;
			System.out.println(num[i]);
		}
		
		//그 값을 출력
		for (int i = 0; i < num.length ; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
		
		**/
		
		/***
		//길이가 10인 배열을 선언 1~10까지의 값을 반복문을 이용해서
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		
		int[] arr = new int[10]; //길이가 10인 배열 arr 선언
		
		// 1~10까지의 값을 역순으로 배열에 할당
		
		int value = arr.length; //arr.length = 10
		
		for(int j = 0 ; j <arr.length ; j++) {
			arr[j] = value--; //arr[0]=9, arr[1]=8, .... ,arr[9]=0
			//value = value -1;
		}
		
		for (int j = 0 ; j < arr.length ; j++) {
			System.out.println("arr[" + j + "] = " + arr[j] );
		}
		***/
		
		//3. 길이가 5인 String 배열 선언
		// "사과" "귤" "포도" "복숭아" "참외"로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하기
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"}; //type이 string
		
		System.out.print(fruits[1]);
		
	}

}
