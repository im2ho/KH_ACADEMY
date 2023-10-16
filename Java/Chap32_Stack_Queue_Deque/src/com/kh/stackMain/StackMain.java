package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); // stack import 필요
		
		// stack에 값 추가 push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		/**
		 
		 마치라잌물통~
		 
			 \
			 |	     |
			 |	 3   | 물통을 부으면 데이터 3부터 따라진다~
			 |	 2   |
			 |___1___| 넣은건 1부터 넣엇는데! 와우~
		 
		**/
		
		// stack 값 삭제 pop() : 어차피 마지막 놈 뺴는거라 item은 따로 지정 X
		System.out.println(stack.pop()); // 3제거, 반환
		System.out.println(stack.pop()); // 2제거, 반환
		
		// stack 전체 값 제거 (초기화) : 스택이름.clear();
		stack.clear();
		
		// stack 가장 상단 값(가장 마지막에 넣은 값) 출력
		stack.peek();
		
		// stack 크기 출력
		stack.size();
		
		// stack empty : 스택이 비어잇는지 체크~ (boolean)
		// 비엇당 > true, 노노머가잇음 > false
		stack.empty();
		
		// stack에 특정 값이 있는지? (boolean) ex) stack에 1이 잇나요?
		stack.contains(1);
	}

}
