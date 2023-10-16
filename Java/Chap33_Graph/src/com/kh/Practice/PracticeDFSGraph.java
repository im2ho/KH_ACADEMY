package com.kh.Practice;

import java.util.LinkedList;

public class PracticeDFSGraph {
	
	private int n; //그래프의 노드 수
	private LinkedList<Integer>[] adjList;
	//adjList : 인접리스트를 저장하는 배열을... 생성해봣어요
	
	//그래프 생성자~
	public PracticeDFSGraph(int num) {
		n = num;
		adjList = new LinkedList[n];
		for(int i=0 ; i<num ; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// a에서 b로 가는 엣지를 추가하는 메서드
	public void addEdge(int a, int b) {
		adjList[a].add(b);
	}
	
	// 깊이 우선 그래프 탐색
	public void DFS(int startNode) {
		boolean[] visited = new boolean[n];
		DFSUtil(startNode, visited);
	}
	
	// 실제 깊이 우선 탐색 수행
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true; 
		System.out.print(currentNode + " "); //노드번호 출력
		
		for(int nextdoor : adjList[currentNode]) {
			if(!visited[nextdoor]) { //만약 인접 노드를 방문하지 않앗다면
				DFSUtil(nextdoor, visited);
			}
		}
	}
}
