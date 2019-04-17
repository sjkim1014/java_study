package java15_Io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
		OutputStream os;	//출력객체 변수	
		os = System.out;	//표준출력(모니터) 스트림
		
		//PrintStream out -> OutputStreadm os
		
		try {
			os.write(97);	// 'a'			
			os.write(98);	// 'b'
			os.write(99);	// 'c'
			os.write(13);	//\r
			os.write(10);	//\n
			
			os.write('H');
			os.write('i');
			os.write('\n');
			//flush하지 않으면
			//출력스트림의 출력버퍼에만 데이터가 전송되고 긑남
			//flush를 수해앟면 출력장치까지 전송됨
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("+ + + 프로그램 종료 + + +");
	}
	
}
