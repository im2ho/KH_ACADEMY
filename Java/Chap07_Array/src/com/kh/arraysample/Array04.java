package com.kh.arraysample;

public class Array04 {
	public static void main(String[] args) {
		
		// Array 예제
		
		/*
		String[] inturnArray = {"나루토","사스케","이타치","사이","카카시"};
		
		//이타치가 탈주해서 못 나온대. 그래서 
		
		inturnArray[2] = "가아라"; //대신 투입!
		*/
		
		/* 예제 String[] fruitArray = {"사과","딸기","키위","메론","귤");
		사과 > 바나나, 딸기 > 수박, 키위 > 레몬, 메론 > 귤, 귤> 오렌지
		*/
		
		String[] fruitArray = {"사과","딸기","키위","메론","귤"};
		
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		
		System.out.print(fruitArray); //[Ljava.lang.String;@5e91993f
	} 

}
