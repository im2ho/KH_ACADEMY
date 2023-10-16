package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh학생1");
		System.out.println(stKim.serialNum);
		
		//학교에서 학생이 회원가입
		//일단 우리학교 학생이 맞는지 확인 필요 > 시리얼 넘버로 인증하자
		stKim.serialNum++;
		
		StaticVar stLee = new StaticVar();
		stLee.setStudentName("Kh학생2");
		
		System.out.print("Kh 학생1 : ");
		System.out.println(stKim.serialNum);
		
		System.out.print("Kh 학생2 : ");
		System.out.println(stLee.serialNum);
		
		//결론: static변수는 main()애서 사용하고, 한 번에 변경 적용?이 가능함
	}

}
