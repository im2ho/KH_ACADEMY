package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Lotto;

public class LottoRun {
	
	public static void main(String[] args) {
		
		//실행용 메소드로 기본 생성자를 통해 Lotto 객체 생성 후 information()로 정보 출력
	
				Lotto number = new Lotto();
				//Lotto number = new Lotto(null);
				number.information();

	}

}
