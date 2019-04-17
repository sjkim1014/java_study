package java15_Io.charstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex02_CharStream {
	public static void main(String[] args) {
		//입출력스트림
		Reader rd = new InputStreamReader(System.in);
		Writer wt = new OutputStreamWriter(System.out);
		
		//입출력 보조 변수
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			while((len=rd.read(cbuf))!=-1) {
				wt.write(cbuf,0,len);
			}
			wt.flush();
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
