package com.kh.genericsMain;

//제네릭 클래스 정의하기
public class Book<T> {
	T content; //모든 타입의 변수를 포괄하겠다
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
	

}
