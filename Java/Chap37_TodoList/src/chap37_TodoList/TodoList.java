package chap37_TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	
	//멤버변수
	private ArrayList<String> tasks;
	
	//생성자
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask(int index) {
		if(index >= 0 && index <tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("잘못된 인덱스입니다");
		}
	}
	
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i=0 ; i<tasks.size() ; i++) {
			System.out.println((i+1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할 일 추가: add, 삭제: remove,"
					+ "할 일 보기: list, 종료: exit, 뒤로가기: back\n원하는 작업의 번호를 입력하세요");
			
			String choice = sc.nextLine(); // .nextLine()
			
			//equalsIgnoreCase(String anotherString) : 대소문자 고려 사항을 무시하고 값 비교
			if(choice.equalsIgnoreCase("add")) {
				while(true) {
					System.out.println("할 일을 입력하세요");
					String task = sc.nextLine();
					todoList.addTask(task);
					//int time = sc.nextInt();
					if(task.equalsIgnoreCase("back")) { //back을 입력하면 탈출~
					break;
					}
				}
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removetask(index);
				} catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다");
				}
			} else if(choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			} else if (choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		sc.close();
	}

}
