package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_03_read {
	public static void main(String[] args) {
		InputStream is;	//입력객체변수
		is = System.in;	//표준입력(키보드)스트림
		
		//입력데이터 저장소
		StringBuffer sb = new StringBuffer();
		int len=0;	//입력 데이터 길이
		byte[] buf = new byte[1024];	//입력데이터 버퍼
		
		System.out.println("<<입력대기중...>>");
		
		try {
			while((len = is.read(buf, 0, buf.length))!= -1) {
				//buf배열에서 입력받은 데이터만 문자열로 변환
				String str = new String(buf,0,len);
				
				sb.append(str);	//입력받은 데이터 sb에 추가
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n<<입력결과>>");
		System.out.println(sb);
	}
	
}
