package java16_network.socketBasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket sock = null; //클라이언트 통신 소켓
		PrintWriter out = null; //출력스트림
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			//127.0.0.1:9988 로 접속요청 보내기
			sock = new Socket("127.0.0.1",9988);
//			sock = new Socket("localHost",9988);
			
			System.out.println("클라이언트 접속 완료");
			
//			sock.getInputStream();	//서버에서 온걸 받는것			
//			sock.getOutputStream();	//클라이언트에서 보내는것
			
			//autoFlush적용한 소켓 출력스트림
			out = new PrintWriter(sock.getOutputStream(), true);
			//데이터 출력 - 서버로 전송
			out.println("Hello, Server");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();	//출력스트림 닫기
		}
	}
}
