package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_BufferedOutputStream {
	
	public static final String PATH="./src/java15_Io/filterstream";
	public static final String FILENAME="TestOutPut";
	
	public static void main(String[] args) {
		//파일객체
		File file = new File(PATH,FILENAME);
		
		//출력스트림 선언
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//출력스트림 개설
			fos = new FileOutputStream(file);		//1차스트림
			bos = new BufferedOutputStream(fos);	//2차스트림
			
			//출력
			
			bos.write("안녕하세요 자바자바".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}

















