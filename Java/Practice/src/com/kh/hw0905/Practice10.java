package com.kh.hw0905;

public class Practice10 {

	public static void main(String[] args) {
		/*
		 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요
		 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요?
		 */
		
		//1. 주민번호 만들기
		String addressNum = "123456-7890123"; //14자리 (대시(-) 포함)
		
		//2. 성별자리 이후 별표 만드는거 만들기
		String makeStar = "*";
		//to char Array를 사용해서 String -> char Array로 변경
		
		char[] numStar = addressNum.toCharArray();
		//{'1','2','3','4','5','6','-','7','8','9','0','1','2','3'}
		
		//for(주민번호 9번째 자리~끝자리까지 '*' 처리 하기)
		for(int i = 8; i <= (numStar.length - 1) ; i++) { //numStar.length=14
			numStar[i] = '*';
		}
		
		System.out.println(numStar); //for문의 변수 i는 사용 불가

	}

}