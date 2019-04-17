package java15_Io.filterstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_DataInputStream {
	public static void main(String[] args) {
		//파일객체생성
		File file = new File("./src/java15_Io/filterstream",
				"DataStreamTest");
		
		//파일 입력 스트림
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			
			//데이터 읽기
			int readInt = dis.readInt();
			System.out.println(readInt);
			
			boolean readBoolean = dis.readBoolean();
			System.out.println(readBoolean);
			
			char readChar = dis.readChar();
			System.out.println(readChar);	
			
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

















