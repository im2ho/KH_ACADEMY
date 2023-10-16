package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File_IOMain {
	
	public static void main(String[] args) {
		
		try {
			// ���ϻ���									//�� ��° ������ ���� true�� �����Ǹ� �ش� ���Ͽ� �̾�Ⱑ ��
			FileWriter fw = new FileWriter("Pokedex.txt",true);
			
			// ���� �ȿ� ���� ����
			// int ���� ���ɾ��� ?
			fw.write("���� ����\n");
			fw.write("������ ��ġ��\n");
			fw.write("������ ���̹�\n");
			fw.write("���̸� ���ڸ�\n");
			
			FileReader reader = new FileReader("Pokedex.txt");
			// ���۸� ����..
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close();
			
			fw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}