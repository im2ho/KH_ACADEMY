package com.kh.practice0829;

import java.util.Scanner;

public class VariablePractice04 {
	public static void main(String[] args) {
		
		//���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		//���1: indexNum Ȱ��
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String word;
		word = sc.next();
		
		char a1 = word.charAt(0); // int index �迭����
		//�迭: ���������̶� ù ��° ���� �ڸ��� 0���� ������
		//char: ���ڸ� �� ���ھ� �д´�
		//apple�̶�� ���ڴ� 1�ڸ��� �Ѿ�� ������.. char�� �ٷ� ���� �� x
		//�ڸ���ġ�� charAt()���� �����ؼ� �д´�
		
		char a2 = word.charAt(1);
		char a3 = word.charAt(2);
		
		System.out.println("ù ��° ���� : " + a1);
		System.out.println("�� ��° ���� : " + a2);
		System.out.println("�� ��° ���� : " + a3);
		
		
		//���2
		String a4 = word.substring(3,4); //char�� �ٸ��� �� �͵� ��°���
		//substring(2,4): startIndex3���� endIndex4 �������� ���
		//���� �������� ������ ������ �ε��� ��ġ���� ������ ��µ�
		System.out.println("�� ��° ����: " + a4);
	}

}
