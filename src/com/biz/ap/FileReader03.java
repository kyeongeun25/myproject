package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/grade.txt";
		
		// fileReader�� buffer�� try�� �ߴܵǴ���
		// �����ؼ� fileReader.close(), buffer.closer()�� �����ؾ� �� �ʿ䰡 �ִ� �κ��̴�.
		// �׷��� �� ��ü�� try ������ �ϴ� �����ϰ�
		// try ���ο��� ��ü�� �����ϴ� ������� 
		// �ڵ带 �ۼ��ϴ� ���� ����.
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		int intSum = 0;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true) {
				line = buffer.readLine();
				if(line == null) break ;
				int intNum = Integer.valueOf(line);
				intSum += intNum ;
				
			}
			buffer.close();
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("���� ���� �� ���ڰ� �ƴ� �κ��� ����");
		}
		
		System.out.println(intSum);

	}

}
