package java16_network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket servSock = null; // 서버리슨소켓
		Socket sock = null;	// 서버 통신 소켓
		
		try {
			//서버 리슨소켓 생성
			servSock = new ServerSocket(9988);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			//클라이언트 접속 대기
			System.out.println("Listening....");
			sock = servSock.accept();	//Listen
			//--------BLOCKED------------
			System.out.println("클라이언트 연결됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
