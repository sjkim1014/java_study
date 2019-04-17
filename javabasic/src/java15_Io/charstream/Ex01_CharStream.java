package java15_Io.charstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex01_CharStream {
	public static void main(String[] args) {
		//InputStreamReader
		//InputStream -> Reader
		//바이트스트림 -> 문자스트림
		
		//OutputStreamWriter
		//OutputStream -> Writer
		//바이트스트림 -> 문자스트림
		
		//표준입력 스트림- > 문자스트림
		Reader rd = new InputStreamReader(System.in);
		
		//표준출력스트림 -> 문자스트림
		Writer wt = new OutputStreamWriter(System.out);
		//입력한문자
		int in = -1;
		
		try {
			while((in=rd.read())!=-1) {
				wt.write(in);
//				wt.flush(); //1줄씩 flush, enter를 만났을때
			}
			wt.flush(); //입력한 모든내용 flush, EOF를 만났을때
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(rd!=null) rd.close();
				if(wt!=null) wt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
