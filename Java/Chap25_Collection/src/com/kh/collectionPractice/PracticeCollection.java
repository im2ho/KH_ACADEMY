package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
		
	}
	
	public void practiceList() {
		List<String> pracList = new ArrayList<>();
		//String add 해보고 포문 출력		
		pracList.add("브케인");
		pracList.add("리아코");
		pracList.add("치코리타");
		
		System.out.println("starting_vol2 : ");
		for(String starting_vol2 : pracList) {
			System.out.println(starting_vol2);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 포문 출력 중복된 값 add 해야함
		pSet.add("꾸꾸리");
		pSet.add("주리비안");
		pSet.add("리아코");
		pSet.add("꾸꾸리"); //중복허용XXXXXXXXXXXX
		
		System.out.println("starting_vol5 : ");
		for(String starting_vol5 : pSet) { //type : String으로 바꿔주기
			System.out.println(starting_vol5);
		}
	}
	
	public void practiceMap() {
		//키와 값을 이용해서 map put 한 다음 향상된 포문으로 출력해보기
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("나세희", 3713);
		pMap.put("나규희", 6216);
		pMap.put("나근일", 8616);
		pMap.put("정경숙", 4770);
		
		System.out.println("<!!!우리가좍!!!>");
		for(String familiy : pMap.keySet()) {
			int code = pMap.get(familiy);
			System.out.println(familiy + " number : " + code);
		}		
	}

}
