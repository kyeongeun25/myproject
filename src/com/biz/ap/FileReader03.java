package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/grade.txt";
		
		// fileReader와 buffer는 try가 중단되더라도
		// 참조해서 fileReader.close(), buffer.closer()를 실행해야 할 필요가 있는 부분이다.
		// 그래서 두 객체는 try 이전에 일단 선언만하고
		// try 내부에서 객체를 생성하는 방식으로 
		// 코드를 작성하는 것이 좋다.
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
			System.out.println("파일 내용 중 숫자가 아닌 부분이 있음");
		}
		
		System.out.println(intSum);

	}

}
