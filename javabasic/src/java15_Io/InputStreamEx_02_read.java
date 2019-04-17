package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02_read {
	public static void main(String[] args) {
		InputStream is;	//입력객체변수
		is = System.in;	//표준입력(키보드)스트림
		
		//입력데이터 저장소
		StringBuffer sb = new StringBuffer();
		
		int len = 0;	//입력데이터길이
		byte[] buf = new byte[4];	//입력데이터버퍼
		int total = 0 ;
		
		System.out.println("<<입력 대기중...>>");
		
		try {
			while(	(len = is.read(buf)) != -1){
			
				// buf의 0인덱스부터 len 길이만큼 문자열로 생성
				String str = new String(buf,0,len);
				sb.append(str);
				total+=len;
				
				System.out.println("len : " +len+"b");
				System.out.println("str : "+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n<<입력 결과>>");
		System.out.println("입력 총길이 : "+total);
		System.out.println(sb);
	}
}
