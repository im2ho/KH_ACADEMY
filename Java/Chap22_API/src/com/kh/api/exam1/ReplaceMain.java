package com.kh.api.exam1;

public class ReplaceMain {
	//글자 자체를 교체
	public static void main(String[] args) {
		/*
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-"); //공백을 하이픈으로 변경
		System.out.println(reInput); //출력값: Hello,-world!
		
		String input2 = reInput.replace("-"," ");
		System.out.println("input2 : " + input2);
		*/
		
		ReplaceMain rm = new ReplaceMain(); //클래스 인스턴트 rm생성
		rm.replace(); //인스턴트에 메서드 적용
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replaceAll();
	}
	
	public void replace() {
		String input = "Hello World!";
		//World를 Java로 교체
		String reInput = input.replace("World" , "Java");
		System.out.println(reInput);
	}
	
	public void replace2() {
		String originName = "Hello World!";
		// 'o'로 적혀있는 문자열들 'x'로 변경하기
		String reName = originName.replace("o", "x");
		System.out.println(reName);
	}
	
	public void replace3() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//fox를 cat으로 바꾸기
		String reString = originString.replace("fox", "cat");
		System.out.println(reString);
		
	}

	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//모든 공백 제거하기
		String reString = originString.replace(" ", "");
		System.out.println(reString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace 대신 replaceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		
		System.out.println(reAllstr);
		
	}
}
