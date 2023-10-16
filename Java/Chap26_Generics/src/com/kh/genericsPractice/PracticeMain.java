package com.kh.genericsPractice;


import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		//String Integer T사용하여 출력
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		
	}
	
	public void practice1() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("브케인");
		strList.add("리아코");
		strList.add("치코리타");
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(155);
		intList.add(158);
		intList.add(161);
		
		//제너릭 메서드 사용
		printList(intList);
		printList(strList);
	}
	
	public void practice2() {

	}
	
	//제너릭 메서드 정의
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
		

}
}