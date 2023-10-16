package com.kh.genericsPractice;

import com.kh.genericsMain.Book; //Book가져오

public class Box {

	public static void main(String[] args) {
		//정수형데이터저장
		Book<Integer> intBox = new Book<>();
		intBox.put(158);
		intBox.put(155);
		int intValue = intBox.get();
		System.out.println("Int value : " + intValue);
		
		//문자열데이터저장
		Book<String> strBox = new Book<>();
		strBox.put("r");
		strBox.put("s");
		String strValue = strBox.get();
		System.out.println("String value : " + strValue);
		
	}

}