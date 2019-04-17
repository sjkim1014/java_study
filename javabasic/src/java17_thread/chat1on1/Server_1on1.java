package java17_thread.chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//+ Server_1on1 class
//// 생성자
//+ Server_1on1()
//	ServerSocket 생성
//	accept();
//	chat(Socket);
//
//+ chat(Socket): void
//   new Sender(Socket).start();
//   new Receiver(Socket).start();
//
//+ main()
//	new Server_1on1();

public class Server_1on1 {
	public Server_1on1() {
		ServerSocket servSock = null; 
		Socket sock = null; 	
		
		try {
			servSock = new ServerSocket(10006);			
	
			System.out.println("+ + 서버 시작 + +");
			System.out.println("클라이언트 대기중");
						
				sock = servSock.accept(); //리슨
				
				//클라이언트 접속 정보 
				InetAddress ip = sock.getInetAddress(); //클라이언트 ip정보
				System.out.println("\n클라이언트 접속("
						+ip.getHostAddress()+")");
				
				chat(sock);
			
		} catch (IOException e) {
			System.out.println("통신종료");
//			e.printStackTrace();
		}
		
		
		
	}
	
	public void chat(Socket sock) {
		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
	}
	public static void main(String[] args) {
		new Server_1on1();
	}
}
