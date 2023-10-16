package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("ÂàÀÌ");
		myDog.info();
		myDog.speak();
		
		Cat myCat = new Cat("³ªºñ");
		myCat.info();
		myCat.run();
		
		Monkey myMonkey = new Monkey("ÃÊ¿°¸ù");
		myMonkey.info();
		myMonkey.sleep();
		
		Lion myLion = new Lion("½É¹Ù");
		myLion.info();
		myLion.roar();
	}

}