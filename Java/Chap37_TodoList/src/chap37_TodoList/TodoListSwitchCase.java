package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListSwitchCase {

	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNumber = 1;
		
		Scanner sc = new Scanner(System.in);
		
		// �� �� ����� ����
		while(true) {
			
			System.out.println("�۾��� �����ϼ��� : ");
			
			System.out.println("1. �� �� �߰�");
			System.out.println("2. �� �� ����");
			System.out.println("3. �� �� ��� ����");
			System.out.println("4. todoList ����");
			// choice�ϴµ�.. ���ڸ� �Է� ���ϸ� ��į...
			
			String choice = sc.next();
			sc.nextLine();
			
			switch(choice) {
				
				case "1":
					System.out.println("�߰��� ���� �ۼ����ּ���");
					String task = sc.nextLine();
					todoMap.put(taskNumber++, task);
					System.out.println("�߰� �Ϸ�");
					break;
				
				case "2":
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("���� �Ϸ�");
					} else {
						System.out.println("��ȿ���� ���� ��ȣ�Դϴ�");
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
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("��ȿ���� ���� �����Դϴ�. �ٽ� �������ּ���");
				}
			}
		

	}

}