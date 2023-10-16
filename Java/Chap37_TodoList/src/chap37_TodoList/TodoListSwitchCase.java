package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListSwitchCase {

	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNumber = 1;
		
		Scanner sc = new Scanner(System.in);
		
		// 할 일 목록을 적자
		while(true) {
			
			System.out.println("작업을 선택하세요 : ");
			
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 제거");
			System.out.println("3. 할 일 목록 보기");
			System.out.println("4. todoList 종료");
			// choice하는데.. 숫자를 입력 안하면 어캄...
			
			String choice = sc.next();
			sc.nextLine();
			
			switch(choice) {
				
				case "1":
					System.out.println("추가할 일을 작성해주세요");
					String task = sc.nextLine();
					todoMap.put(taskNumber++, task);
					System.out.println("추가 완료");
					break;
				
				case "2":
					System.out.println("제거할 일의 번호를 입력하세요");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("제거 완료");
					} else {
						System.out.println("유효하지 않은 번호입니다");
					}
					break;
					
				case "3":
					System.out.println("===TODOLIST===");
					for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					System.out.println("==============");
					break;
					
				case "4":
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요");
				}
			}
		

	}

}