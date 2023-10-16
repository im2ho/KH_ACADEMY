package com.kh.classSample;

public class Car {
	
	//1. 상태 필드 멤버변수
	String brand; //브랜드
	String model; //모델
	int speed; //속도
	boolean engineOn; //엔진 상태
	/*================================================
	 * 멤버변수 밑에는 모두 메서드로 정의
	 */
	
	//2. 생성자 (메서드의 일종)
	public Car(String brand, String model) { 
				//차를 볼 때 필수로 넣을 파라미터는 브랜드와 모델
		System.out.println("Car의 정의"); //출력 메서드
		this.brand = brand; //맨날 초기화 시켜준다
		//this.brand = "KN" ;//차량을 KN 브랜드 안에서만 보겠어... > CarMain에서 KN만 나옴
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	
	//3. 엔진 시작 메서드 (차를 구입할 때 엔진이 잘 돌아가는지 체크)
	public void startEngine() { //void 
		System.out.println("차 종은 " + brand + "입니다.");
		//만약에 엔진이 true : 엔진 시동
		if(engineOn) {
			System.out.println("엔진을 시동합니다."); //출력 메소드 작성
		} else { //false : 이미 엔진이 켜져있다
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
	}
	
	//4. 가속 메서드
	public void acclerate(int amount) {//파라미터 이름(amount) : 내가 표시하고싶은 이름 맘대로 쓰면 됨...
		if(engineOn) {
			//엔진이 true면 지금 속도가 얼마다.
			speed = speed + amount; //????
			System.out.println("속도 " + amount + "입니다."); //????
		} else {
			//엔진이 false면 엔진이 꺼져있어 속도를 낼 수 없다.
			System.out.println("속도를 알 수 없음");
		}
		
		
	}
}

/**
메서드(Method) :
특정 작업을 수행하기 위한 코드블록 함수. 
클래스 내에 정의되며, 클래스의 객체들이 해당 메서드를 공유하여 사용할 수 있음
	객체의 상태를 변경하거나 객체에 대한 작업을 수행하는데 사용
	
	ex) System.out.println(); :  출력 메서드
	
매개변수(Parameter) :
	 함수의 정의에서 전달 받은 인수를 함수 내부로 전달하기 위해 사용하는 변수
**/