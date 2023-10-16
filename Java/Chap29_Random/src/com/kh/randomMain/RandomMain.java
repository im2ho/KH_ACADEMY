package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용되는 클래스 나나난나나나나나나나난
 	난수 : 무작위로 만들어진 수 수수수수수수수수수수수수수수수수
 */

public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain(); //랜덤 객체 생성
		rm.Lotto();
	}
	
	public void Lotto() {
		
		// 랜덤 객체 생성
		Random rd = new Random(); //Random import 필요
		
		// ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		
		// 중복을 피하기 위해 set을 사용할 수 있음..
		// 여섯 개 숫자만 들어갈 것
		int lottosize = 6; // 로또 번호 몇 개 뽑을 것인지 설정
		while(lottoNum.size() < lottosize) { // 0, 1, 2, 3, 4, 5
			
			// 1 ~ 45 범위를 지정해서 난수 생성
			int ranNumber = rd.nextInt(45) + 1; // 0~44 +1 자리의 랜덤으로 번호 하나
			
			// 존재하는지 여부 중복x
			if(!lottoNum.contains(ranNumber)) { //ㅇ니ㅏ어라ㅣㅜ하ㅣㄱ다ㅣㅜ하ㅣㄷ긓.,니ㅏㅜㄹㅈ대ㅔㅔ의ㅏㅡㅁ,.리ㅡㅏㅇㄹㄴ이ㅏㄴ
				// !가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프 이ㅏ런이ㅏ솔재ㅑㄷ수ㅏㅓㅟㅏㅓㅑㅓㅗㅑㅐㅓ
				lottoNum.add(ranNumber);
			}
		}
			
		System.out.println("로또 번호 : " + lottoNum);
	}
	
	/*
	public void RandomExam() {
		
		
		// 1. 정수 범위 내에서 랜덤인 난수를 만들궛어요
		int ranInt = rm.nextInt(100); // 0에서 99 사이에서 1개
		System.out.println(ranInt);
		
		// 2. 실수 범위 내에서 랜덤인 난수 만들기
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		// 3. Boolean 값 랜덤으로 생산
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	*/
	
}
	


