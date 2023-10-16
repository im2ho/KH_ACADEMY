package com.kh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> { //comparator import 필요

	@Override
	public int compare(String num1, String num2) {
		// 길이가 같으면 0을 반환
		if(num1.length() == num2.length()) {
			return 0;
		} else if(num1.length() > num2.length()) {
			//num1이 num2보다 길면 양수 반환
			return 1;
		} else {
			//num1이 num2보다 짧으면 음수
			return -1;
		}
		//오름차순으로 정리하는 코드???
	}
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("cherry");
		str.add("mango");
		str.add("kiwi");
		str.add("dragonfruits");
		str.add("석과");
		str.add("분노의호두과자");
		str.add("복슝열매");
		str.add("오랭열매");
		str.add("pineapple");
		
		// Comparator를 사용해서 문자열을 정렬해보궛어요?
		Collections.sort(str, new ComparatorMain());
		
		// 정렬된 결과 출력 (문자열 길이 오름차순으로 출력된다~~~~~) > 길이가 같으면 문자 순서대로 ~
		// 우선순위 1. 길이 2. 순서
		// 한글 소문자 대문자 순서
		for(String s : str) {
			System.out.println(s);
		}
	}

}
