package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM { // AM 생성자를 classBM에서 만들고 싶어!
	public void am() {
		
		AM am = new AM();
		
		 publicMethod();
		 protectedMethod(); //패키지 안에 무언가를 해야지만 사용 가능
		 	//main 메서드에서 직접 호출을 하거나.. 뭔가를 통해 호출
		 	//접근 제한자를 가지고있어서 같은 패키지 내에서 호출이 가능하지만 extends 사용해서 호출을 한다
		 
		 //am.defaultMethod(); //같은 패키지 안에서 사용이 가능함 (다른 패키지이므로 사용 불가)
		 //am.privateMethod();
	}
}
