package com.kh.practice0829;

public class CastingPractice03 {
	
	// method�� main�� ����?
	public void method() {
	/*���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����� ����ȯ�� �̿��Ͽ� 
	  �ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���. */
	
		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';
		
		System.out.println((float)dNum); //2.5��� ���� (float ����ȯ ����: �����Ⱚ ��� ����)
		
		System.out.println((int)fNum); //float fNum = 3.0f; -> 3
		System.out.println(iNum1 / (int)fNum); // 3 ������ �Ǽ��� ������ 3�� ������ ���
		System.out.println(iNum1 / fNum); //������ �Ǽ��� ������ 3.333333�� float�� ���
		System.out.println((double)iNum1 / fNum); //������ �Ǽ��� ������ 3.333333333333333335�� double ���
		
		System.out.println(ch); //'A' char ��� ����
		System.out.println((int)ch); // 65 int�� �����ؼ� ���
		System.out.println((int)ch + iNum1); // int�� ch�� ���� �� ���ϱ�
		System.out.println((char)((int)ch + iNum1)); // ���� �ڵ� �״�� char�� ����ȯ
	}

}
