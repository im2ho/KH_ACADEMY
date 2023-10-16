package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeBFSGraph {

	private int N; //그래프의 정점 수
	private LinkedList<Integer>[] adj; // 인접한 리스트를 저장할 배열 adj 선언
	
	//생성자
	public PracticeBFSGraph(int n) {
		N = n;
		adj = new LinkedList[n];
		for(int i=0 ; i<n ; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	//그래프 간선 추가하는 메서드 addEdge
	public void addEdge(int n, int m) { // n, m : 양끝정점
		adj[n].add(m);
	}
	
	//BFS 탐색 수행
	public void BFS(int start) {
		//방문 여부를 표시하기 위한 배열 선언
		boolean[] visited = new boolean[N];
		
		//BFS
		Queue<Integer> queue = new LinkedList<>(); //Queue import 필요
		
		//시작노드(start)에서 탐색 시작하고 queue에 추가
		visited[start] = true; //시작점 방문햇습니다
		queue.add(start);
		
		//큐가 비어질 때까지 반복적으로 다음 단계에 인접한 노드 방문
		while(!queue.isEmpty()) {
			start = queue.poll(); //poll() : 큐에서 요소를 제거하고 반환
			System.out.print(start + " ");
			
			for(Integer nextdoor : adj[start]) {
				if(!visited[nextdoor]) { //옆노드가 없으면
					visited[nextdoor] = true; //방문한거임..
					queue.add(nextdoor); //방문목록에 넣어주기?
				}
			}
		}
	}
}
