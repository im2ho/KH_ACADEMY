package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {

	//반복문을 이용하여 배열 출력
		//1. 멤버변수
		int[] lotto = new int[6]; //lotto 배열 생성
		Random random = new Random(); //새로운 Random 클래스
		
		//2. 생성자
		public Lotto() { //난수값 초기화..
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = random.nextInt(45)+1; //랜덤으로 난수를 배열에 입력(1~45 사이의 정수)
			}
		}
		/*
		public Lotto(int[] lotto) { //난수값 초기화..
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = random.nextInt(45)+1; //랜덤으로 난수를 배열에 입력(1~45 사이의 정수)
			}
		}
		*/
		
		//2. 로또 번호 출력 메소드
		public void information() {
			for(int i=0;i<6;i++) {
				System.out.println(lotto[i]);
			}
		}

}
