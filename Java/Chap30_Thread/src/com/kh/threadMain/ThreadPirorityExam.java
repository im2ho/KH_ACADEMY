package com.kh.threadMain;

public class ThreadPirorityExam {

	public static void main(String[] args) {
		
			StudentThread st1 = new StudentThread("학생 1");
			StudentThread st2 = new StudentThread("학생 2");
			
			// 스레드에 우선순위 설정
			st1.setPriority(Thread.MAX_PRIORITY);
			st2.setPriority(Thread.MAX_PRIORITY);
			
			//스레드 시작
			st1.start();
			st2.start();
		
	}

}