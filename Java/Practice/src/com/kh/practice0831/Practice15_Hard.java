package com.kh.practice0831;

import java.util.Scanner;

public class Practice15_Hard {
	//public void practice015(){} ���..?
	public static void main(String[] args) {
		
		//1. ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���
		Scanner sc = new Scanner(System.in); //�Է¹ޱ� ���� �ҷ����� �޼ҵ�
		System.out.print("�Ҽ� �Ǻ���\n2 �̻��� �ڿ��� �ϳ��� �Է��Ͻʽÿ�: "); //��� �޼ҵ�
		int num =sc.nextInt();
		
		//2. ��(=if), �Է��� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�."�� ����ϼ���
		
		//3. �Ҽ�: n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ��
		
		//4. �Ҽ��Դϴ�. �Ҽ��� �ƴմϴ�. �߸� �Է��ϼ̽��ϴ�. <���
		
		if(num<2) {//�Է��� ���� 2���� ���� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else if(num==2) {//�Է��� �� =2�� ���
			
			System.out.println("�Ҽ��Դϴ�.");
		
		} else {//�Է��� ���� 2���� Ŭ ���
			
			boolean checkNum = true; //�Ҽ����� �Ǻ��ϱ� ���� boolean ���� checkNum �ʱ�ȭ ó������ �Ҽ� ����
			
			for(int i=2;i<num;i++) { //�Ҽ����� �Ǻ��� �� �� �ִ� �ݺ���
				
				if(num%i==0) {
					checkNum = false; //�Ҽ��� �ƴ�
					break; //���� ������ for�� break
				}
				
			} 
			
			if(checkNum==true) {
				
				System.out.print("�Ҽ��Դϴ�");
			
			} else { //checkNum == false�� ���
				
				System.out.print("�Ҽ��� �ƴմϴ�");
			
			}
		}

	}

}