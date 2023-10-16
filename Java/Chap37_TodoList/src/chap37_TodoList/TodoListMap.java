package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListMap {
	
	//�������
	private Map<String, Integer> tasks = new HashMap<>();
	
	//������
	public TodoListMap() {
		tasks = new HashMap<>();
	}
	
	public void addTask(String task, int time) {
		tasks.put(task, time); //����
	}
	
	public void removetask(String task) {
		if(tasks.containsKey(task)) { //task���� ������ �ִٸ�~~~?
			tasks.remove(task);
		} else {
			System.out.println("�߸��� task�Դϴ�");
		}
	}
	
	// list ��� �޼���
	public void displayTasks() {
		System.out.println("My TodoList");
		//���� for��~
		for(Map.Entry<String, Integer> entry : tasks.entrySet()) {
			String task = entry.getKey();
			int time = entry.getValue();
			System.out.println(task + ": " + time + "��");
		}
	}
	
	public static void main(String[] args) {
		//�ν��Ͻ� ����..
		TodoListMap todolist = new TodoListMap();
		//��ĳ�� import
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("�� �� �߰�: add, ����: remove,"
					+ "�� �� ����: list, ����: exit\n���ϴ� �۾��� �Է��ϼ���");
			String choice = sc.next(); //next��...nextLine ����?
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���");
				String task = sc.next();
				System.out.println("�� �� �ð��� �Է��ϼ���");
				int time = sc.nextInt();
				todolist.addTask(task, time);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ ���� �Է��ϼ���");
				try {
					String removeTask = sc.next(); //������ �� �Է¹ޱ�
					todolist.removetask(removeTask);
					System.out.println("�����Ϸ�");
				} catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�");
				}
			} else if(choice.equalsIgnoreCase("list")) {
				todolist.displayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�..");
			}
			
		}
		
		sc.close();
	}

}
