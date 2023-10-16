package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 	StringTokenizer : 클래스 문자열을 분리하는 데 사용
 	주어진 구분자(기본:공백)를 기준으로 문자열을 토큰으로 분리
 */
	public static void main(String[] args) {
		
		/*
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//tokenizer
		//hasMorTokens
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token); //띄어쓰기를 기준으로 출력
		}
		*/
		
		StringTokenizerMain stm = new StringTokenizerMain(); //인스턴스 생성
		//stm.STExam4();
		stm.stringtoMath();
	}
	
	public void STExam() {
		String text = "apple, banana, grape, orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ","); //,를 기준으로 구분하궛어요
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam2() {
		// '-' 구분자를 사용해서 text만들고 '-' 구분자로 끊어서 출력하기
		String text = "피카츄-라이츄-파이리-꼬부기-야도란";
		StringTokenizer tokenizer = new StringTokenizer(text,"-"); //-로 구분하궛어
		
		while(tokenizer.hasMoreTokens()) {
			String pokemon = tokenizer.nextToken();
			System.out.println(pokemon); // -를 기준으로 출력
		}
	}
	
	public void STExam3() {
		//특정 단어 제외하고 구분자로 분리
		String text = "This is a test. But not a real one." ;
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) { //test가 아니면 출력해버리겠다
				System.out.println(word);
			}
		}	
	}
	
	public void STExam4() {
		//날짜 구분자로 분리
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken()); //parseInt
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		
		System.out.println("Year : " + year + "년");
		System.out.println("Month : " + month + "월");
		System.out.println("Day : " + day + "일");
	}
	
	public void stringtoMath() { //문자열에서 뭐.. 숫자를 하나 가져와볼까
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")){//개행문자 외우세요..
				System.out.println("Number : " + token);
			}
		}
	}

}
