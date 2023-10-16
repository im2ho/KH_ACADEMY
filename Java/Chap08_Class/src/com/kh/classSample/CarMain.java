package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		
		//public Car(String brand, String model) > Car.java 매개변수 참조(브랜드와 모델은 필수로 넣기로 했잖아..)
		
		Car System = new Car("Toyota", "Carmy"); //자동차(Car)의 객체 생성 (new: 하나의 객체를 새로 생성하겠어요~)
		//다른건 몰라도 브랜드, 모델의 string은 무적권 넣어줍니다
		
		System.startEngine();
		System.acclerate(50);

	}

}
