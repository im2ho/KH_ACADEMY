package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 ArrayList 이용해서
 3개 할 일 만들고
 2개 수정하고
 1개 지우고
 전부 다 삭제하기
 */


public class TodoSample {

	public static void main(String[] args) {
		// 빈 ArrayList 생성
		ArrayList<String> todo = new ArrayList<>();
		
		//할 일 추가
		todo.add("유도");
		todo.add("쭌이 산책");
		todo.add("공부");
		System.out.println("할 일 : " + todo);
		
		//할 일 수정
		todo.set(1, "쭌이 목욕");
		todo.set(2, "유튜브");
		System.out.println("수정된 할 일 : " + todo);
		
		//할 일 삭제
		todo.remove(2);
		System.out.println("할 일 최종 : " + todo);
		
		//순회해서 요소출력
		//for(String aaaaa : )
			
		//중복된 할 일 제거

	}

}
