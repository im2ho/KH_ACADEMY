package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class PlayerExam {

	public static void main(String[] args) {
		// 이름 나이 찾기 어쩌구
		// HashMap 생성
		Map<String, Integer> playerInfo = new HashMap<>();
		
		// 이름과 나이를 추가해주자
		playerInfo.put("주지태", 17);
		playerInfo.put("영웅", 18);
		playerInfo.put("양기훈", 19);
		playerInfo.put("이자경", 20);
		playerInfo.put("이지은", 17);
		
		
		//containsKey(), containsValue() : 기본적으로 boolean형식으로 나옴
		System.out.println(playerInfo.containsKey("양기훈"));
		System.out.println(playerInfo.containsValue(20)); //truefalse(있나없나..)반환
		
		//----------------------------------------------------------
		
		// 특정 학생 이름 검색(key) > 나이 추출(value)
		String playerName = "영웅"; //만약에 영웅이 있다면..
		if(playerInfo.containsKey(playerName)) {
			int age = playerInfo.get(playerName); //영웅이 나이를 내놔라
			System.out.println(playerName + "의 나이 : " + age +"세");
		} else {
			System.out.println(playerName + "의 정보를 찾을 수 없습니다.");
		}
		
		/*
		// 특정 학생 나이(value) 검색 > 이름 추출(key)
		int playerAge = 17;
		if(playerInfo.containsValue(playerAge)) {
			String name = playerInfo.get(playerAge); //value는 어떻게 get하지?
			//없는듯...
			System.out.println(playerAge + "세 학생 : " + name );
		} else {
			System.out.println(playerAge + "세의 정보를 찾을 수 없습니다.");
		}
		*/
		
	}

}
