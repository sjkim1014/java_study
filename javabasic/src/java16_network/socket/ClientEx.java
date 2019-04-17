package java16_network.socket;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket sock = null; //클라이언트 통신 소켓
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			//127.0.0.1:9988 로 접속요청 보내기
			sock = new Socket("127.0.0.1",9988);
//			sock = new Socket("localHost",9988);
			
			System.out.println("클라이언트 접속 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
