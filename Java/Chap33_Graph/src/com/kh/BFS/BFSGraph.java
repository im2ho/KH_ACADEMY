package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph 클래스
 	자료 구조를 나타냄
 */
public class BFSGraph {
	
	private int V; // 그래프의 '정점' 수
	private LinkedList<Integer>[] adj; // 인접 리스트 배열 선언
	
	// 그래프 초기화
	// Graph 클래스의 생성자에서 그래프의 정점 수 (V)를 받아서 초기화
	//adj 인접 리스트를 나타내고, 각 정점마다 인접한 정점들의 목록을 저ㅇ자
	public BFSGraph(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i=0 ; i<v ; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	// 그래프 간선 추가
	// addEdge 그래프에 간선을 추가
	// v와 w가 양끝 정점을 나타냄
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//BFS탐참색 수행
	public void BFS(int start) {
		// 방문 여부를 표시하기 위한 배열
		// visit 배열은 각 정점의 방문 여부를 추적
		boolean[] visited = new boolean[V];
		//BFS
		Queue<Integer> queue = new LinkedList<>();
		// 탐색은 시작노드(start)에서 시작하고
		// 시작노드를 방문하고 큐에 추가
		visited[start] = true;
		queue.add(start);
		//큐가 비어질 때까지 반복적으로 다음 단계에 인접한 노드를 방문
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}