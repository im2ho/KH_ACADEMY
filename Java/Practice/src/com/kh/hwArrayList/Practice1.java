package com.kh.hwArrayList;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		/*
		ArrayList 이용해서 빨주노초파남보
		수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
		향상된 for문 이용해서 색상 출력하기
		최 후 출력 빨 파 보
		*/
		
		ArrayList<String> colors = new ArrayList<>(); //객체 생성
		System.out.println("colors :" + colors); //리스트 확인 (공백)
		
		//빨주노초파남보
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		
		System.out.println("colors 색상 추가 :" + colors);
		
		//수정 3회
		colors.set(0, "블랙");
		colors.set(2, "브라운");
		colors.set(4, "그린");
		
		System.out.println("colors 수정 :" + colors);
		
		//더하기 2회 -> 블랙, [옐로우], 그린, [연한파랑]
		//옐로우 노 브라운 그린 [연한파파랑]
		//방법1. 노랑 브라운 삭제
		
		//방법2.
		
		//인덱스 이용해서 자리 출력
		
		//초기화 후 최후어쩌구 출력
	}

}
