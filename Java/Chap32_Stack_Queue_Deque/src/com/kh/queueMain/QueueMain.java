package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		// 큐(Queue) 생성
		// Queue는.. stack과 다르게 인터페이스로.. new Queue로 생성 불가
		Queue<String> queue = new LinkedList<>(); // Queue import 필요
		
		/**
		 
		  Front						   Rear(tail)
		    ↓							   ↓
		 +-----+		+-----+			+-----+
		 |     |		|     |			|     |
		 |  1  |		|  2  |			|  3  |
		 |     |		|     |			|     |
		 +-----+		+-----+			+-----+
		 
		 
		 
		 
		 */
		
		
		// 큐에 요소 추가
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		// 큐에서 요소 추출 및 출력 (FIFO 순서대로 출력됨)
		String removedElement =queue.poll(); // 큐에서.. 첫번째로 쌓인.. Apple을 제거하고 반환
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // Banana 제거하고 반환
		
		// 큐의 Front 요소 확인 (제거하지 않고 확인만~~~~~)
		String fontElement = queue.peek(); // queue의 front 요소 Cherry 반환
		System.out.println("?");
		
		// 큐의 크기 확인
		int size = queue.size(); // 사과 바나나 삭제해서 1로 나옴
		System.out.println("size : " + size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll(); // poll() : 요소추출
			System.out.println(element);
		}

	}

}

/**


**/