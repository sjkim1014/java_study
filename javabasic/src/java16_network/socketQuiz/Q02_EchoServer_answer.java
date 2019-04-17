package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Q02_EchoServer_answer {
	public static void main(String[] args) {

		ServerSocket servSock = null; //리슨소켓
		Socket sock = null; //통신소켓

		BufferedReader in = null; //입력스트림
		PrintWriter out = null; //출력스트림
		
		try {
			servSock = new ServerSocket(10006); //리슨소켓 생성
			
			while(true) {
				System.out.println("[SYSTEM] 서버 활성화중입니다");
				System.out.println("[SYSTEM] 3...");
				System.out.println("[SYSTEM] 2...");
				System.out.println("[SYSTEM] 1...");
				System.out.println("[SYSTEM] OK...!");
				
				System.out.println("\n[SYSTEM] Listening... ["+servSock.getLocalPort()+"]");
				sock = servSock.accept(); //리슨
				
				//클라이언트 접속 정보 
				InetAddress ip = sock.getInetAddress(); //클라이언트 ip정보
				System.out.println("\n[SYSTEM] 클라이언트 접속("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				//입력스트림 생성
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream())); 
	
				//출력스트림 생성, autoFlush=true
				out = new PrintWriter(sock.getOutputStream(), true);
				
				System.out.println();
				String recieved = null; //받은 메시지
				while( true ) { //반복적으로 입력받기
					recieved = in.readLine();
					if(recieved == null) {
						System.out.println("\n[SYSTEM] 상대방이 대화를 종료했습니다");
						break;
					}
					System.out.println(">>받은 메시지 : "+recieved);
					
					out.println(recieved); //메시지 반송
				} //while(true) end
				
				if(in!=null)	in.close(); //입력스트림닫기
				if(out!=null)	out.close(); //출력스트림닫기
				if(sock!=null)	sock.close(); //통신소켓닫기
			} //while(true) end
		} catch (IOException e) {
			e.printStackTrace();
		} //try end
	} //main end
}
