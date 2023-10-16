package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		
		// 그래프 노드 개수 num 10개로 정의햇음요
		int num = 10;
		PracticeDFSGraph dg = new PracticeDFSGraph(num);
		PracticeBFSGraph bg = new PracticeBFSGraph(num);
		
		
		dg.addEdge(1, 2);
		dg.addEdge(1, 3);
		dg.addEdge(2, 4);
		dg.addEdge(4, 5);
		dg.addEdge(4, 6);
		dg.addEdge(3, 4);
		dg.addEdge(5, 7);
		
		bg.addEdge(1, 2);
		bg.addEdge(1, 3);
		bg.addEdge(2, 4);
		bg.addEdge(4, 5);
		bg.addEdge(4, 6);
		bg.addEdge(3, 4);
		bg.addEdge(5, 7);
		
		System.out.println("DFS 탐색 결과 : ");
		dg.DFS(3); // 출발점 지정
		
		System.out.println(" ");
		System.out.println("BFS 탐색 결과 : ");
		bg.BFS(3); // 출발점 지정
		
		//시작점보다 더 올라가서 출력되지 않음..
		
	}

}