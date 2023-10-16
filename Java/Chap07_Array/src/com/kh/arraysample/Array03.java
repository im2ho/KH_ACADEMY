package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		//toCharArray(): String 을 char 배열로 만들어주는 기능
		
		/*
		 1. 문자열을 입력 받아서 
		 2. 문자 하나하나 배열에 넣고
		 3. 검색할 문자 scanner 
		 4. 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와(length), 
		 5. 몇 번째 인덱스에 위치하는지 
		 6. 인덱스 출력하기(index값 출력)
		 */
		
		/**
		 1.
		 2. 문자 하나하나 배열에 넣는다. 
		  - String 안에 있는 문자들을 배열로 담는다.
		  - char로 문자를 만들어서 만든 문자드을 배열에 넣는다.
		  - String 안에 char 배열로 만들어주는 녀석 => toCharArray
		  	ex) String 안녕하세요 = {'안','녕','하','세','요'}
		 **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String inputString = sc.next();
		
		System.out.print("검색할 문자(한 글자)를 입력하세요. : "); //검색할 문자 입력 받기
		char searchChar = sc.next().charAt(0); //첫 번째
		
		//문자열을 -> 문자로 반환
		// ex) 안녕하세요 . -> {'안','녕','하','세','요'} 배열화
		//toCharArray: 문자열을 문자 배열로 변환하는 역할
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length; //배열로 변환된 길이가 어떻게 되는가~
		System.out.println("charCount(문자열 개수 체크) : " +charCount);
		
		//총 길이(length)가 얼마나 되는지 확인하고, 각 자리값 출력하기
		
		int count = 0; //검색할 문자 개수 카운트
		
		System.out.print(inputString + " 에 " + searchChar + "이(가) 존재하는 위치(인덱스) : ");
		//반복문을 사용해서 위치 찾기
		for (int i=0; i<=charCount ; i++) {
			//만약에 내가 이 단어를 검색했을 때 이 문자는 몇 번째 인덱스에 위치하는지 인덱스 출력하기
			if(charString[i] == searchChar) { //charString[i]: 고정값이 아니라 i값이 되어야 하는 이유는?
				//searchChar 우리가 검색해서 문자값을 지정해주기 때문에 갑이 고정돼야
				//문자배열이 내가 검색한 문자와 일치하는가?
				System.out.print(i + " ");
			
			}
			count ++ ;
		}
		
		System.out.print(count + "개");
		

	}

}
