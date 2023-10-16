package com.kh.example.practice2.model.vo;

public class Product {
	//1. 멤버변수 생성
	private String  pname ;
	private int  price ;
	private String brand ;
		
	//2. 생성자 this를 활용해서 만들어야 함
	//+ Product()
	public Product(String pname, int price, String brand) {
		this.pname = pname;
		this.price = price; //초기값 0을 넣으면 어떤 값을 넣어도 가격이 출력되지 X
		this.brand = brand;
	}
	
	 //3. 정보 출력 메소드 만들기
	 //+ information() : void
	 public void information() {
		 //sysout + ctrl + space = 출력메소드 완성
		 
		 System.out.println("상품명 :" + pname);
		 System.out.println("가격 :" + price + "원");
		 System.out.println("브랜드 :" + brand + "\n");
	 }

}
