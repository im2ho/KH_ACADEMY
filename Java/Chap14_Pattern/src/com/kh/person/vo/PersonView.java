package com.kh.person.vo;

import java.util.Scanner;

public class PersonView {//사람의 정보를 화면에 출력
	
	//클라이언트가 넣을 입력값
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 이름을 입력하세요: ");
		return sc.next();
	}

}
