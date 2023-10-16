package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 BFSmain 메서드
 그래프의 BFS탐색을 구현하고, 주어진 시작 노드로부터 모든 연결된 노드를 너미 우선으로 참색
 */

public class BFSMain {
	
	public static void main(String[] args) {
		
		//Graph 생성
		BFSGraph g = new BFSGraph(6);
		
		//간선추가
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		
		System.out.print("BFS 탐색 결과 : ");
		//BFS를 시작 노드 0에서 호출해서 실행
		g.BFS(0);
		//결과: BFS의 탐색 결과인 노드 순서 출력
	}
}
