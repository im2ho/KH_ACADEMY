package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.GoodPlayer;

public class GoodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("팬텀");
		player1.ValidName();
		
		player1.setHp(-10); //-10 체력 저장해주고
		player1.ValidHp();
		//-10이 무결성(내가 만든 코드가 결점이 없는지)
		
		player1.displayInfo();
		
		//---------------------------------------
		
		//player2에 valid를 적용해보자!
		
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName(""); //공격받은 캐릭터
		player2.ValidName();
		
		player2.setHp(58);
		player2.ValidHp(); //체력값 검증하기
		
		player2.displayInfo();
		
		System.out.println("공격 후");
		
		player1.attack(player2);
		
		//player.attack(player1);
		
	}

}
