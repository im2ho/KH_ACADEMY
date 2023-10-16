package com.kh.ListandArray;

import java.util.ArrayList;
import java.util.List;

public class List_and_Array {

	public static void main(String[] args) { 
		
		List_and_Array LA = new List_and_Array();
		LA.ListArray1(); //heap 메모리
		
		ListArray2(); //static메모리로 이동 (글씨체부터 다르다 덜덜)
	}
	
	public void ListArray1() { //static
		//Array 예제
		int[] intArray = new int[2]; //크기가 2인 정수배열 intArray생성
		intArray[0]=1;
		intArray[1]=2;
		
		//Array 출력
		System.out.println("Array 요소 : ");
		for(int i=0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("-------------------\n");
		
		//List 예제
										//빈 배열 리스트 생성
			List<Integer> intList = new ArrayList<>(); //Integer: 객체를 저장하는 Array
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
		
			//List 출력
			System.out.println("List 요소 : ");
			for(int num : intList) {
				System.out.println(num + " ");
			}
	}

		
	public static void ListArray2() { //static
		//String으로 변경 후 Array와 List출력해보기
		//1.Array
		
		String[] fruits = new String[4];
		
		fruits[0] = "딸기";
		fruits[1] = "포도";
		fruits[2] = "사과";
		fruits[3] = "메론";
		
		System.out.println("과일 : ");
		for(int i=0 ; i < fruits.length ; i++) {
			System.out.print(fruits[i] + ", ");
		}
		
		System.out.println();
		
		//2.List
		List<String> StringList = new ArrayList<>(); //String 받는 방법..
		StringList.add("딸기");
		StringList.add("수박");
		StringList.add("포도");
		StringList.add("참외");
		
		System.out.println("과일 List : ");
		for(String item : StringList) {
			System.out.print(item + ", ");
		}
		
	}
		
}
