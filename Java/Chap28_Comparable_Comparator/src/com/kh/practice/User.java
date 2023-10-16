package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	//List ArrayList 생성 Comparator생성
	
	@Override
	public int compare(String user1, String user2) {
		if(user1.length() == user2.length()) {
			return 0;
		} else if(user1.length() > user2.length()) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();
		
		str.add("Rugal");
		str.add("Kenso");
		str.add("Atena");
		str.add("Iori");
		str.add("Kim");
		str.add("Lucky");
		str.add("Chriss");
		str.add("JohnTerry");
		
		// Comparator를 사용해서 문자열을 정리해주자
		Collections.sort(str, new User());
		
		for(String player : str) {
			System.out.println(player);
		}
	}
}
