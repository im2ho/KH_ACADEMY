package com.kh.thisSample;
/*
 int x = 10; //정수 x를 10값 할당
 int y = x;  //참조변수 y : x를 가리킨다.
		
 x = 20;
		
 System.out.println("y : " +  y); // y = 10
		
 int[] list1 =  {1,2,3};
 int[] list2 = list1; //참조변수 list2
 //참조변수: 값을 직접적으로 입력해서 넣지 않고, 다른 변수 참조해서 값을 얻는 변수
 
 
  this	객체(=인스턴스) 자신을 가리키는 '참조'변수 객체(=인스턴스)의 주소가 저장되어있음
  this() 현재 클래스의 다른 생성자를 호출하는데 사용
*/

class Myclass{
	int myField; //this.myField
	
	//첫 번째 생성자
	Myclass(){
		//this.myField = 0;
		this(0); //this() 사용해서 다른 생성자 호출
	}
	
	//두 번째 생성자
	Myclass(int value){
		this.myField = value;
	}
	
	void printValue(){
		System.out.println("myField의 값 : " + this.myField);
	}
}

public class ThisMain {
	public static void main(String[] args) {
		
		Myclass obj1 = new Myclass(); //첫 번째 생성자 호출
		Myclass obj2 = new Myclass(10); //두 번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();

	}
}