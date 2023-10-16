package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("List : ");
		// 향상된 for문 활용해서 출력
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		// set 예제
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); //중복된 요소는 허용 거부
		
		for(Integer number : myset) {
			System.out.println(number);
		}
		
		//Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		//국가번호를 적어보자..
		myMap.put("한국", 82); //put사용 (add X)
		myMap.put("일본", 81);
		myMap.put("중국", 86);
		myMap.put("미국", 1);
		myMap.put("스페인", 43);
		myMap.put("독일", 49);
		myMap.put("스페인", 34); //스페인 중복 허용x, 가장 마지막에 들어온 대상을 출력함
		
		for(String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
			//순서보장X
		}
	}

}
