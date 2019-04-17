package java15_Io.filterstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {
	public static void main(String[] args) {
		//파일객체생성
		File file = new File("./src/java15_Io/filterstream",
				"DataStreamTest");
		
		//파일 출력 스트림 객체 선언
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//데이터 출력
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeChar('T');
			dos.writeChars("안녕!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

















