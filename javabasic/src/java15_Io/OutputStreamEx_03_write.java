package java15_Io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {
	public static void main(String[] args) {
		OutputStream os;	//출력객체 변수	
		os = System.out;	//표준출력(모니터) 스트림
		
		byte[] buf = new byte[1024];
		int len = 0;	//의미있는 데이터의 길이
		
		buf[len++] = 65;
		buf[len++] = 66;
		buf[len++] = 67;
		buf[len++] = 10;
		
		buf[len++] = 'H';
		buf[len++] = 'o';
		buf[len++] = 'l';
		buf[len++] = 'a';
		buf[len++] = '\n';
		
		try {
			os.write(buf,0,len);
						
			String str = "Hello";
			byte[] tmp = str.getBytes();
			os.write(tmp);
			os.flush();// 출력버퍼비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("+ + + 프로그램 종료 + + +");
	}
	
}
