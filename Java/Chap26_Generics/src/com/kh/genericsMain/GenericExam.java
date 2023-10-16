package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(82);
		intBook.put(1);
		int intValue = intBook.get(); //형변환이 필요 없다
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("전국도감");
		strBook.put("호연도감");
		strBook.put("성도도감");
		strBook.put("신오도감");
		
		String strValue  = strBook.get();//형변환 필요X
		
		//제너릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고
		//출력도 가능
		System.out.println("Int value : " + intValue);
		System.out.println("String Valie : " + strValue);
		
	}

}
