package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		// ArrayList 생성 및 요소 추가
		ArrayList<String> snack = new ArrayList<>();
		snack.add("칸쵸");
		snack.add("초코러스크");
		snack.add("대파크림치즈팝콘");
		
		// Iterator 생성 (java.util에서 import필요)
		Iterator<String> iter = snack.iterator();
		
		// Iterator를 사용하여 요소 반복 (while문을 사용하지 않으면 무한루프에 걸릴 수 있음)
		while(iter.hasNext()) { 
			//hasNext : 다음에 가져올 값이 있을 때까지 true인 메서드. boolean타입을 반환한다
			String snk = iter.next();
			System.out.println(snk);
		}
		
		// Iterator를 사용하여 요소 삭제
		iter = snack.iterator(); //다시 Iterator 초기화
		while(iter.hasNext()) {
			String snk = iter.next(); //상단 while문의 snk는 지역변수이므로 여기서도 사용 가능
			// 만약에 대파크림치즈팝콘이 들어오면 삭제하길 원함
			if(snk.equals("대파크림치즈팝콘")) {
				iter.remove(); //현재요소 삭제
			}
			
			System.out.println(snk);
		}
		
		// 삭제 후 ArrayList 출력
		System.out.print("삭제 후 출력 : ");
		for(String a : snack) {
			System.out.print(a + ", ");
		}

	}

}