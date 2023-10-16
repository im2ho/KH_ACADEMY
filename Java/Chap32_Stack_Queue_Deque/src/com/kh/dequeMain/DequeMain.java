package com.kh.dequeMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

	public static void main(String[] args) {

		/**
		 
			  시작				  		끝
			 
			   ↓ 				 		↓
			 
			[First] <-> [Second] <-> [Third] 
		
		 ↑									  ↑
		
	   [   ]	 						    [   ]


		**/

		// ArrayDeque 사용하여 Deque 생성
		Deque<String> deque = new ArrayDeque<>();
		
		// 요소 추가
		deque.addFirst("처음");
		deque.addLast("끝");
		
		// 맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// 맨 앞과 맨 뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		
		// 요소가 비어잇나 확인
		System.out.println(deque.isEmpty());
	}

}