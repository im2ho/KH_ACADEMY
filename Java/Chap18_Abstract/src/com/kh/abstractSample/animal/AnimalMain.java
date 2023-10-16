package com.kh.abstractSample.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog("윈디" , "컹컹");
		dog.displayName(); //displayName이 이미 출력 기능이 있기 때문에 system.out.print를 통해 출력 불가
		dog.animalVoice();
		
		//1.cat만들기
		Cat cat = new Cat("나옹", "냐옹");
		
		//2.객체배열로 Animal 정의해서 출력하기 (다형성을 활용한 객체 다루기)
		Animal[] animal = new Animal[3];
		//추상클래스는 객체가 아니라서 animal[0] = new Animal(어쩌구)와 같은 형태로 사용 불가
		animal[0] = new Dog("윈디","컹컹");
		animal[1] = new Dog("가디","멍멍");
		animal[1] = new Cat("나옹","야옹");
		
		for(Animal i : animal) {
			i.displayName();
			i.animalVoice();
		}
		
	}
	
	
	

}