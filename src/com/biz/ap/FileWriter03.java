package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Ű���忡�� ������ �Է� �޾Ƽ�
 * grade2.txt�� ����غ���
 */
public class FileWriter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String fileName = "src/com/biz/ap/grade2.txt" ;
		
		FileWriter fileWriter = null ;
		BufferedWriter buffer = null ;
		
		try {
			// true ���� �־��ָ� ���� �ִ� ���Ͽ� �߰��ϴ� ������� ������ ����.
			// ������ �����ϰ�, ������ ��Ϲ������ ����
			fileWriter = new FileWriter(fileName, true);
			buffer = new BufferedWriter(fileWriter);
			while(true) {
				System.out.print("���� >>");
				String line = scanner.nextLine();
				if(line.equals("~END")) break ;
				
				try {
					int g = Integer.valueOf(line);
					if(g<0 || g>100) {
						System.out.println("���� ���� �ʰ�");
						continue ;
					}
					buffer.write(line);
					buffer.newLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("�Է��� ������ ���ڰ� �ƴ�");
				}
				
				
				
			}
			
			buffer.flush();
			buffer.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
		System.out.println("�Ϸ�Ǿ����ϴ�.");
		
	}

}