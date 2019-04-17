package java15_Io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02_write {
	public static void main(String[] args) {
		OutputStream os;	//출력객체 변수	
		os = System.out;	//표준출력(모니터) 스트림
		
		byte[] buf = new byte[1024];
		buf[0] = 65;
		buf[1] = 66;
		buf[2] = 67;
		buf[3] = 10;
		
		buf[4] = 'H';
		buf[5] = 'o';
		buf[6] = 'l';
		buf[7] = 'a';
		buf[8] = '\n';
		
		try {
			os.write(buf);
			
			String str = "\nHello";
			byte[] tmp = str.getBytes();
			os.write(tmp);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("+ + + 프로그램 종료 + + +");
	}
	
}
