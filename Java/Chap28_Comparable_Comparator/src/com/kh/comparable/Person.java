package com.kh.comparable;

public class Person implements Comparable<Person> { // implements : 인터페이스 구현하는 명령어
	

	//사람의 이름과 나이를 써보겟어요
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override //재정의
	public int compareTo(Person otherPerson) { 
		/*compareTo(T o) 
			T : the type of object that this object may be compared to
			o : the object to be compared
		*/
		
		//나이를 기준으로 비교
			return this.age -otherPerson.age; //다른 사람의 나이를 비교해줄것임
	}
	
	@Override
	public String toString() { //재정의 해주겟음!
		return "Person {name=" + name + "age= " + age + "}";
	}

} 