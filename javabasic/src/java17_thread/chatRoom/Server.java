package java17_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

//-------------------------
//**Server의 내부클래스
//-------------------------
// class Server.ClientManager
// 	extends Thread
//-------------------------
// - sock : Socket
// - clientID : String
//-------------------------
// <<constructor>>
// + ClientManager()
// 
// + run()
//-------------------------
//
//>> 생성자
//	소켓 저장
//	
//>> run() 메소드
//	1. 소켓 입력스트림 생성
//	
//	2. 메시지 입력받기
//	3. 입력받은 메시지 출력(로그)
//	4. 입력받은 메시지 유형에 따라 처리
//	4-1. 메시지 == null
//		로그아웃
//	4-2. 메시지.contains("_ID_IS_") == true
//		로그인
//	4-3. 4-1,4-2 조건이 아닐 때
//		기본 메시지
//	(2~4 반복)
//	5. writerToClients 맵에서
//		로그아웃한 clientID를 remove()
//	6. 소켓 close()
//	
//
//4-1의 상세한 동작
//	클라이언트가 연결을 끊은 경우이다(EOF)
//	
//	clientID+" 로그아웃" 모니터 출력 (로그)
//	
//	 writerToClients 맵의 자신 제외 모든 출력스트림으로
//	clientID+"님이 채팅방을 나가셨습니다" 출력 (알림)
//
//	반복 중단
//	
//
//4-2의 상세한 동작
//	메시지.split("_ID_IS_") 수행
//	
//	메시지에서 clientID 구해서 저장
//	
//	writerToClients에 {clientID:출력스트림} 형식으로 put
//	
//	clientID+" 로그인" 모니터 출력 (로그)
//	
//	 writerToClients 맵의 자신 제외 모든 출력스트림으로
//	clientID+"님이 채팅방에 입장하셨습니다" 출력 (알림)
//	
//	반복 이어감
//
//
//4-3의 상세한 동작
//	 writerToClients 맵의 자신 제외 모든 출력스트림으로
//	clientID+"> 메시지" 출력 (채팅 전달)

//-------------------------
//class Server
//-------------------------
//- PORT : final int
//- writerToClients : Map<String, PrintWriter>
//-------------------------
//+ initChatRoom() : void
//
//+ main()
//-------------------------
//
//>> main() 메소드
//	Server 객체 생성
//	initChatRoom() 호출
//	
//>> initChatRoom() 메소드
//	1. writerToClients 맵 생성
//	2. 서버리슨 소켓 생성
//	
//	3. 클라이언트 LISTEN 및 통신소켓 생성
//	4. ClientManager 객체 생성
//	5. ClientManager에 통신소켓 전달
//	6. ClientManager 스레드 활성화
//	
//	4~6 반복

public class Server {
	private static final int PORT = 10006;
	private Map<String, PrintWriter> writerToClients = new HashMap<String, PrintWriter>();
	
	public void initChatRoom() {
		ServerSocket serv = null;
		Socket sock = null;
		
		try {
			serv = new ServerSocket(PORT);
			
			while(true) {
				System.out.println("서버 시작");
				sock = serv.accept();
				ClientManager cm = null;				
				cm = new ClientManager(sock);				
				cm.start();
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class ClientManager extends Thread{
		private Socket sock = null;
		private String[] clientID = null;
		
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		@Override
		public void run() {
			BufferedReader in = null; //입력스트림
			PrintWriter writer = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				writer = new PrintWriter(sock.getOutputStream());
				InetAddress ip = sock.getInetAddress(); //클라이언트 ip정보
				System.out.println("\n[SYSTEM] 클라이언트 접속("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				System.out.println();
				String recieved = null; //받은 메시지
				while( true ) { //반복적으로 입력받기
					recieved = in.readLine();
					if(recieved == null) {
						System.out.println(clientID[1]+"님이 로그아웃했습니다");
						break;
					}else if(recieved.contains("_ID_IS_") == true) {
						clientID = recieved.split("_ID_IS_",2);
						System.out.println(clientID[1]+"님이 로그인했습니다.");
						writerToClients.put(clientID[1],new PrintWriter(sock.getOutputStream(),true));		
						
						
					}else {
						if(!writerToClients.containsKey(clientID[1])) {
							writer.println(recieved);
						}
						System.out.println(clientID[1]+" : "+recieved);
					}
				} //while(true) end
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {		
		Server ser = new Server();
		ser.initChatRoom();	
	}
}
