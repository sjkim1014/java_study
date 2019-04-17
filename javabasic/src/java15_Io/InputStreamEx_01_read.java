package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		InputStream is;	//입력객체 변수
		
		is = System.in;	//표준입력(키보드) 스트림
		//둘은 같은 메소드
//		is.read();
//		System.in.read();
		
		//-------------------------
		//InputStream으로부터 1바이트씩 입력을 받음
		//StringBuffer객체에 차곡차곡저장
		//End of Stream(EOF)에 도달하면 종료
		
		//입력데이터 저장소
		StringBuffer sb = new StringBuffer();
		int in; //입력데이터 
		int len=0; 	//입력길이
		
		System.out.println("입력대기중....");
		try {
			//키보드로부터의 입력이 EOF를 만나지 않는다면 반복
			while((in = is.read()) !=-1) {
				len++;
				//입력받을 때마다 sb에 char형으로 저장
				sb.append((char)in);			
			}
			//** 키보드로 ctrl+z를 누르면 EOF 가상키 전송
			//^Z : EOF
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------");
		System.out.println("입력한 바이트 수 : "+len);
		System.out.println("입력결과 : "+sb);
		
		
	}
}
