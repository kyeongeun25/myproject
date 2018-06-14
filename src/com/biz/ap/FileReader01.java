package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data.txt ������ �о
 * ���پ� �ֿܼ� ǥ���� ����
 */
public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ������ ����
		// 2. ���� ���� ������ BufferedReader�� ����
		// 3. BufferedReader�� ���� ���ڿ��� �а�
		// 4. �ֿܼ� ǥ��
		// 5. ������ �ݱ�
		
		// ��� ���� ������ ��ο� ���ϸ��� ������ ����
		String fileName = "src/com/biz/ap/data.txt";
		
		// FileReader Ŭ������ �����Ǹ鼭
		// ���� ������ ������ open �ϴµ�, 
		// � �����ε� �����̸��� ����ǰų�, �����ǰų�
		// �Ǵ� ������ open �� �Ŀ� close�� ���� �ʾ��� ���
		// �ý��� exception�� �߻��� �Ѵ�.
		// �̷���� java�� �����ڿ��� �� �ڵ��� exception ó����
		// �����ϵ��� �Ѵ�.
		// �̶� exceptionó���� exception handling�̶�� �Ѵ�.
		try {
			// ���� ����
			FileReader fileReader = new FileReader(fileName);
			// fileReader���� ���Ͽ� ����, �ڵ����� ���� ����Ǿ� �ִ�.
			
			// fileReader�� ������ �ִ� ������ BufferedReader���� ����
			BufferedReader buffer = new BufferedReader(fileReader);
			// �̶� BufferedReader�� fileReader ��θ� ���� data.txt ������ ������ "��� �о�鿩"
			// ���ڿ� ���·� ������ �Ѵ�.
			// ��, data.txt ������ ���ũ�⸦ �Ѿ�� ������ ũ������� �߶� �о� ���δ�.
			
			// �������� buffer�κ��� ���ڿ��� �б� �ϸ�ȴ�.
			
			// buffer ���� ���ڿ��� �о ������ String "��ü"�� ����
			String line = "" ;
			line = new String(); 	// ���Ϸκ��� �о� ���� �� ������ �Ϲ� ���°� �ƴ� ��ü���·� �����ϴ� ���� ����.
			
			while(true) {
				// ���ڿ� ������ �б� 
				line = buffer.readLine(); // �ѹ� ���� �� ������ ���پ� �о���
				// ������ �� ���� �� ������ ���� �κ��� �б��ϸ� null���� return�Ѵ�.
				if(line == null) break;
				System.out.println(line);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// �⺻�޽����� ����
			// e.printStackTrace();	-> �޽����� �����ְ� ������Ʈ�� �ߴ��� ������.
			// �׷��� �⺻�޽����� �����ϰ� ������ �޽��� ǥ�ó� ó���� ���ش�.
			
			System.out.println("������ ���µ� ������ �ֽ��ϴ�.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���� �б� �������� ���� �߻�!!");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
