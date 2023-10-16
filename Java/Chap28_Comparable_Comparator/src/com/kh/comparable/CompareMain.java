package com.kh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("양기훈", 19));
		people.add(new Person("이자경", 20));
		people.add(new Person("안녹희", 17));
		
		// 나이를 기준으로 정렬
		Collections.sort(people); //collection import필요
		
		for(Person person : people) {
			System.out.println(person);
		}

	}

}