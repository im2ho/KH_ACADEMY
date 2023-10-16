package com.kh.classAM;

/**
import com.kh.classAM.AM;

**/
public class OtherAM {

	public static void main(String[] args) {
		
		//AM 생성
		AM am = new AM();
		
		am.publicMethod(); //어떤 클래스에서든 접근 가능
		am.protectedMethod(); //같은 패키지 내에서 접근 가능
		am.defaultMethod(); //같은 패키지 내에서'만' 접근 가능
		//am.privateMethod(); //같은 '클래스' 내에서만 접근 가능 > 출력 불가 (다른 클래스에 존재하기 때문)
	}
	
	

}
