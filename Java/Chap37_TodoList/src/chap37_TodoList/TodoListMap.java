package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListMap {
	
	//멤버변수
	private Map<String, Integer> tasks = new HashMap<>();
	
	//생성자
	public TodoListMap() {
		tasks = new HashMap<>();
	}
	
	public void addTask(String task, int time) {
		tasks.put(task, time); //ㅋㅋ
	}
	
	public void removetask(String task) {
		if(tasks.containsKey(task)) { //task값을 가지고 있다면~~~?
			tasks.remove(task);
		} else {
			System.out.println("잘못된 task입니다");
		}
	}
	
	// list 출력 메서드
	public void displayTasks() {
		System.out.println("My TodoList");
		//향상된 for문~
		for(Map.Entry<String, Integer> entry : tasks.entrySet()) {
			String task = entry.getKey();
			int time = entry.getValue();
			System.out.println(task + ": " + time + "시");
		}
	}
	
	public static void main(String[] args) {
		//인스턴스 생성..
		TodoListMap todolist = new TodoListMap();
		//스캐너 import
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("할 일 추가: add, 삭제: remove,"
					+ "할 일 보기: list, 종료: exit\n원하는 작업을 입력하세요");
			String choice = sc.next(); //next와...nextLine 차이?
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요");
				String task = sc.next();
				System.out.println("일 할 시간을 입력하세요");
				int time = sc.nextInt();
				todolist.addTask(task, time);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일을 입력하세요");
				try {
					String removeTask = sc.next(); //삭제할 일 입력받기
					todolist.removetask(removeTask);
					System.out.println("삭제완료");
				} catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다");
				}
			} else if(choice.equalsIgnoreCase("list")) {
				todolist.displayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다..");
			}
			
		}
		
		sc.close();
	}

}
