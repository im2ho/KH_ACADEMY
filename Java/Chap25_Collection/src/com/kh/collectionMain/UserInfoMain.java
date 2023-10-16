package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		// HashMap 생성 UserLevel
		Map<String, Integer> UserLevel = new HashMap<>();
		
		// 유저의 이름과 나이
		UserLevel.put("옐덕", 62);
		UserLevel.put("김이호", 45);
		UserLevel.put("나사자", 43);
		UserLevel.put("마시", 76);
		UserLevel.put("칸쵸", 82);
		UserLevel.put("본탁", 81);
		UserLevel.put("응칠인만무방", 97);
		
		// 특정 유저 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하려는 유저 아이디를 입력하세요 : ");
		String UserID = sc.next();
		
		if(UserLevel.containsKey(UserID)) {
			int level = UserLevel.get(UserID);
			System.out.println(UserID + "의 레벨 : " + level);
		} else {
			System.out.println(UserID + "의 계정을 찾을 수 없습니다..");
		}
		
		// 모든 학생과 성적 출력
		System.out.println("=====전체 유저 레벨=====");
		for(Map.Entry<String, Integer> entry : UserLevel.entrySet()) {
			String ID = entry.getKey();
			int level = entry.getValue();
			System.out.println(ID + " : lv." + level);
		}
		
		// 유저 나이 수정
		String UserUpdate = "옐덕";
		int newlevel = 100;
		UserLevel.put(UserUpdate, newlevel);
		System.out.println(UserUpdate + "의 레벨을 " + newlevel + "로 수정했습니다..");
		
		// 유저 탈퇴
		String removeUser = "김이호";
		UserLevel.remove(removeUser);
		System.out.println(removeUser + "의 계정을 삭제했습니다");
		
		// 최종 유저 정보 출력
		System.out.println("최종 유저 정보 : ");
		for(Map.Entry<String, Integer> entry : UserLevel.entrySet()) {
			String ID = entry.getKey();
			int level = entry.getValue();
			System.out.println(ID + " : lv." + level);
		}
	}

}
