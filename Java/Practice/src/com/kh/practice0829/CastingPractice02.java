package com.kh.practice0829;

import java.util.Scanner;

public class CastingPractice02 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	//Practice02: �Ǽ������� ���� �Է¹ް�, ���� �� ����� ���������� ����ϱ�
		
	double kor, math, eng;
	
	System.out.print("���� :");
	kor = sc.nextDouble();
	
	System.out.print("���� :");
	math = sc.nextDouble();

	System.out.print("���� :");
	eng = sc.nextDouble();
	
	int sum = (int)(kor + math + eng) ; //sum�� int�� ����ȯ
	int avg = (int)(sum/3); //avg�� int�� ����ȯ
	
	System.out.println("���� : " + sum);
	System.out.println("��� : " + avg);
	

		
		
	/*���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����� ����ȯ�� �̿��Ͽ� 
	  �ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���. */
	
	
		

	
	}
}
