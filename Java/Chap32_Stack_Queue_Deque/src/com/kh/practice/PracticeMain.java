package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// stack에 값을 저장 삭제 초기화 등 메서드 사용 마음껏 해보세요~~~^^
		PracticeMain pm = new PracticeMain();
		
		pm.PracticeStack();
		pm.PracticeQueue();
	}
	
	public void PracticeStack() {
		Stack<String> pokedex = new Stack<>();

		// 데이터를 넣어보자~
		pokedex.push("브케인");
		pokedex.push("마그케인");
		pokedex.push("블레이범");
			
		// 마지막 데이터만 뽑아보자~
		System.out.println("마지막으로 추가한놈 : " + pokedex.peek());
			
		// 다 지울래
		pokedex.clear();
			
		// 값이 비엇나요?
		System.out.println("도감에 암것두 없나요? : " + pokedex.empty()); //boolean형으로 나온다
			
		// 다시 데이터를 넣어보자~
		pokedex.push("미뇽");
		pokedex.push("신뇽");
		pokedex.push("망나뇽");
			
		// 미뇽이가 잇나요?
		System.out.println("미뇽이가 잇나요? : " + pokedex.contains("미뇽"));
			
		// 민용이가 잇나요?
		System.out.println("민용이가 잇나요? : " + pokedex.contains("민용"));
			
		// 사이즈가 어케 되나요?
		System.out.println("도감 목록 : " + pokedex.size() + "마리");
	}
	
	public void PracticeQueue() {
		// Queue는.. stack과 다르게 인터페이스로.. new Queue로 생성 불가
		Queue<String> pokedex = new LinkedList<>();
		
		pokedex.offer("리아코");
		pokedex.offer("엘리게이");
		pokedex.offer("장크로다일");
		pokedex.offer("칠색조");
		pokedex.offer("루기아");
		
		int number = pokedex.size();
		System.out.println("도감 완성도 : " + number + "마리");
		
		String removedPokemon = pokedex.poll(); //리아코 제거하고 반환
		System.out.println(removedPokemon);
		
		removedPokemon = pokedex.poll(); //엘리게이 제거하고 반환
		System.out.println(removedPokemon);
		
		System.out.print("도감 목록(재) : ");
		while(!pokedex.isEmpty()) {
			String pokemon = pokedex.poll();
			System.out.print(pokemon + " ");
		}
	}
	
	public void PracticeDeque() {
		
	}
	

}