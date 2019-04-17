package java15_Io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03_CharStream {
	public static void main(String[] args) {
		//입출력스트림
		Reader rd = new InputStreamReader(System.in);
		Writer wt = new OutputStreamWriter(System.out);
		
		//보조스트림
		BufferedReader br = new BufferedReader(rd);
		BufferedWriter bw = new BufferedWriter(wt);
		
		//입출력 보조 변수
		String str = null;
		
		try {
			while((str=br.readLine())!= null) {
				bw.write(str);
				bw.newLine();	//개행해주는것
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(br!=null) rd.close();
				if(bw!=null) wt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
