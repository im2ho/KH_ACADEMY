package com.kh.hwArrayList;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		/*
		ArrayList �̿��ؼ� ���ֳ����ĳ���
		���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		���� for�� �̿��ؼ� ���� ����ϱ�
		�� �� ��� �� �� ��
		*/
		
		ArrayList<String> colors = new ArrayList<>(); //��ü ����
		System.out.println("colors :" + colors); //����Ʈ Ȯ�� (����)
		
		//���ֳ����ĳ���
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		
		System.out.println("colors ���� �߰� :" + colors);
		
		//���� 3ȸ
		colors.set(0, "��");
		colors.set(2, "����");
		colors.set(4, "�׸�");
		
		System.out.println("colors ���� :" + colors);
		
		//���ϱ� 2ȸ -> ��, [���ο�], �׸�, [�����Ķ�]
		//���ο� �� ���� �׸� [�������Ķ�]
		//���1. ��� ���� ����
		
		//���2.
		
		//�ε��� �̿��ؼ� �ڸ� ���
		
		//�ʱ�ȭ �� ���ľ�¼�� ���
	}

}
