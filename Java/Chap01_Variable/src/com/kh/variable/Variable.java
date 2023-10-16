package com.kh.variable; //경로: OS(C드라이브)>사용자>user1>Java_Workspace>src>com>kh>variable

public class Variable {
	public static void main(String[] args) {
		
		/* 숫자형 변수
		// 1. 변수의 이름은 영문자, 숫자, _, $ 로 구성 가능
		int a; // int, String 등등: 변수 저장할 공간 내놔!!!!(ex 1byte만큼, 8byte만큼...)
		a = 10;
		
		// 2. 변수의 이름은 숫자로 시작할 수 없다
		// 3. 변수 이름 사이에는 공백 불가 (언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문)
		// 4. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다
		
		// 실수형 (float, double)
		float pie1 = 3.1415929999f; //float은 소수점 마지막에 f나 대문자 F를 작성해준다~
		double pie2 = 3.1415929999; 
		
		System.out.println("float: " + pie1);
		System.out.println("double: " + pie2);
		
		// byte: -128 ~127까지 사용 가능
		// byte bt = -129; //int로 변경하거나 값을 byte + byte로 나눠서 넣어주기
		byte bt = 127;
		System.out.println(bt); // -129이하 및 128이상부터 출력이 되지 않음
		
		//short = -32,768 ~ 32,767까지 사용가능
		short shrt = -32767;
		System.out.println(shrt);
		
		// int: -2,147,483,648 ~ 2,147,483,647 까지 허용 가능
		int nt = -2147483648;
		System.out.println(nt);
		
		// long: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long lng = 2000L; // long은 뒤에 L이나, l을 붙여준다 (추후 int 자동변환 방지 및 관례)
		*/
		
		// 문자형 변수
		// String: 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨 (그래서 아마도.. 대문자로 시작하도록 표현하는 듯)
		// String " "나 ' ' 안에 글자를 작성할 것
		//String name = "쭌이야";
		
		// char : 문자형 글자를 한 문자만 포함할 수 있음
		// char ' '; (큰따옴표 사용불가)
		char chr1 = '쭌';
		System.out.println(chr1);
		
		// 논리형 변수
		// boolean 은 true와 false를 표현한다.
		// boolean bln = true; or false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false; 
		System.out.println(bln2);
		
		System.out.println("안녕하세요. 저는 나세희입니다.");
		String name = "나세희";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		// 한 번 타입을 선언한 변수는 재선언을 하지 않고 재사용 가능
		// 한 번 선언한 타입을 ~다른 타입으로~ 재선언 불가능
		// 선언한 타입을 다른 타입으로 변경해서 선언할 수 없다
		name = "나쭌이";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		
		int age = 13;
		String favor = "공룡장난감";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		System.out.println("저의 나이는 " + age + "세 이고, ");
		System.out.println("저의 취미는 " + favor + "입니다.");
		
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다.");
				
	}
}
