package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(8);
		
		// 문자열 데이터를 저장하는 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello Hello Hello");
		strList.add("WOooorld");
		
		// 제너릭 메서드를 사용해서 요소 출력
		printList(intList); //헉스바리~ ㅇOㅇ
		printList(strList); //얘도 된다~~~ 쩐당

	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}