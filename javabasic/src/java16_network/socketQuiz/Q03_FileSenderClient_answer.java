package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Q03_FileSenderClient_answer {
	public static void main(String[] args) {
		Socket sock = null; //통신소켓
		
		PrintWriter out = null; //출력스트림
		BufferedReader in = null; //입력스트림
		
		//입력대상 파일
		File file = new File("./src/java16_network/socketQuiz", "data.txt");
		
		try {
			sock = new Socket("localhost", 10007); //서버 접속
			
			//출력스트림 생성
			out = new PrintWriter(sock.getOutputStream(), true);
			
			//입력스트림 생성
			in = new BufferedReader(new FileReader(file));
			
			//입출력 보조 변수
			char[] cbuf = new char[1024];
			int len = -1;
			
			//파일 입력 및 전송
			while( (len=in.read(cbuf)) != -1 ) {
				out.write(cbuf, 0, len);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close(); //입력스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(out!=null)	out.close(); //출력스트림 닫기
			try {
				if(sock!=null)	sock.close(); //소켓닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //try end
	} //main end
}
