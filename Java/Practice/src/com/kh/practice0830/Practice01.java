package com.kh.practice0830;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		/*�޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO OO�޴��Դϴ� ��
		���� ��ȣ�� ������ ���α׷��� ����˴ϴ� ������ϼ���*/
		
		/**switch��**/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSwitch������ �ֹ��� �غ���!\n");
		System.out.println("~~~�޴���~~~\n1. ������\n2. �߹�\n3. ������\n4. ġŲ\n7. ����\n~~~~~~~~~~~");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int choice;
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("������ �޴��Դϴ�.");
				break; //break �ɾ����� ������ ���ǹ��� ��ȿȭ�� ��
				
			case 2:
				System.out.println("�߹� �޴��Դϴ�.");
				break;
			
			case 3:
				System.out.println("������ �޴��Դϴ�.");
				break;
				
			case 4:
				System.out.println("ġŲ �޴��Դϴ�.");
				break;
				
			case 7:
				System.out.println("���α׷��� ����˴ϴ�.");
			
			default:
		}
				
		/**if��**/
		System.out.println("\n\nIf������ �ֹ��� �غ���!");
		System.out.println("~~~�޴���~~~\n1. ������\n2. �߹�\n3. ������\n4. ġŲ\n7. ����\n~~~~~~~~~~~");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("������");
		} else if(choice==2) {
			System.out.println("�߹�");
		} else if(choice==3) {
			System.out.println("������");
		} else if(choice==4) {
			System.out.println("ġŲ");
		} else if(choice==7) {
			System.out.println("���α׷��� ����˴ϴ�.");
		} else {
			System.out.println("�߸��� �����Դϴ�.. �ٽ� ������!!!");
		}
		
		
		}
	}


