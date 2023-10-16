package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product; //메서드 가져오기~ (최초 1회만 가져오면 ㅇㅋ ..스캐너처럼)

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고 각각 상품명, 가격, 브랜드명 출력하기 
		//string,int,string
		
		System.out.println("< Product 정보 > \n");
		
		//상품 3개 객체 생성
		Product product1 = new Product("칸쵸",1000,"해태");
		product1.information();
		
		Product product2 = new Product("포카칩",1500,"오리온");
		product2.information();
		
		Product product3 = new Product("꼬북칩",1500,"청우");	
		product3.information();
	}

}
