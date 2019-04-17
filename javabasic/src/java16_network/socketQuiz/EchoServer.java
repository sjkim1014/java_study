package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		ServerSocket servSock = null; // 서버리슨소켓
		Socket sock = null;	// 서버 통신 소켓
		BufferedReader in = null;	//입력스트림
		PrintWriter out = null; //출력스트림
		String str = null;
		
		try {
			//서버 리슨소켓 생성
			servSock = new ServerSocket(9988);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			//클라이언트 접속 대기
			System.out.println("-----------------------");
			System.out.println("Listening Port : "+servSock.getLocalPort());
			System.out.println("-----------------------");
			sock = servSock.accept();	//Listen
			//--------BLOCKED------------
			System.out.println("클라이언트 연결됨");
			
			//클라이언트 IP 정보 얻기
			
			
//			sock.getOutputStream();	//서버에서 보내는것			
//			sock.getInputStream();	//클라이언트에서 받는것
			
			//소켓 입력 스트림
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(), true);
			//데이터입력 - 클라이언트로부터 받기
			while(true) {
				str = in.readLine();
				
//				System.out.println("\n>> 전송데이터 : "+str);				
				if(str.equals("/EXIT")) {
					sock = servSock.accept();
				}else {
					out.println(str);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
