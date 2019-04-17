package java17_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//-------------------------
//**Client의 내부클래스
//-------------------------
// class Client.Sender
// 	extends Thread
//-------------------------
// - sock : Socket
// - writer : PrintWriter
// - reader : BufferedReader
//-------------------------
// <<constructor>>
// + Sender()
// + run()
//-------------------------
//>> 생성자
//	소켓 저장
//>> run() 메소드
//	1.키보드 입력 스트림 생성
//	2.소켓 출력 스트림 생성
//	
//	3. 사용자에게 아이디 입력받기
//	4. "CLIENT_ID_IS_"+아이디 형식으로 소켓출력 (로그인)
//
//	5. 사용자에게 메시지 입력받기
//	6. 메시지 소켓출력 (채팅)
//	5~6 반복
//	7. "exit" 입력시 반복 중단
//	
//	8. 스트림, 소켓 닫기 (로그아웃)


	
//-------------------------
//**Client의 내부클래스
//-------------------------
// class Client.Receiver
// 	extends Thread
//-------------------------
// - sock : Socket
// - reader : BufferedReader
//-------------------------
// <<constructor>>
// + Receiver()
//
// + run()
//-------------------------
//
//>> 생성자
//	소켓 저장
//
//>> run() 메소드
//	소켓 입력 스트림 생성
//	
//	메시지 입력 및 모니터 출력 (반복)
	

//-------------------------
//class Client
//-------------------------
//- HOST : final String
//- PORT : final int
//- clientID : String
//-------------------------
//<<constructor>>
//+ Client()
//
//+ initClient() : void
//
//+ chat(Socket) : void
//
//+ main()
//-------------------------
//
//>> 생성자
//	객체 생성
//	initClient() 호출
//
//>> initClient() 메소드
//	소켓 생성
//	chat() 호출
//
//>> chat() 메소드
//	Receiver 객체 생성 및 스레드 활성화
//	Sender 객체 생성 및 스레드 활성화
public class Client {
	private final String HOST = "localhost";
	private final int PORT = 10006;
	private String cliendID = null;
	Socket sock=null;
	public Client() {		
		initClient();
	}
	
	public void initClient() {
		try {
			sock = new Socket(HOST,PORT);
			chat(sock);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void chat(Socket sock) {
		Receiver rec = new Receiver(sock);		
		Sender sen = new Sender(sock);
		rec.start();
		sen.start();
	}
	
	public static void main(String[] args) {
		Client cl = new Client();	
	}
	
	class Sender extends Thread{
		private Socket sock=null;
		private PrintWriter writer = null;
		private BufferedReader reader = null;
		
		public Sender(Socket sock) {
			this.sock=sock;
		}
		
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				writer = new PrintWriter(sock.getOutputStream());
				System.out.print("아이디를 입력하세요 : ");
				String id = "CLIENT_ID_IS_"+sc.nextLine();			
				writer.println(id);
				//메시지 반복 입력 및 전송
				while(true) {
					//메시지 입력
					System.out.print(">>메시지 입력 : ");
					String msg = sc.nextLine();
					
					//메시지 입력 중단 - 프로그램 종료
					if("exit".equals(msg))	break;
					
					writer.println(msg); //메시지 전송
					writer.flush(); //출력버퍼비우기
				} //while(true) end
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				try {
					if(writer!=null)writer.close();
					if(sock!=null)sock.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Receiver extends Thread{	
		private Socket sock=null;
		private BufferedReader reader=null;
		
		public Receiver(Socket sock) {
			this.sock=sock;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String recieved = null; //받은 메시지
				while( true ) { //반복적으로 입력받기
					recieved = reader.readLine();
					if(recieved == null) {
						System.out.println("\n[SYSTEM] 상대방이 대화를 종료했습니다");
						break;
					}
					System.out.println(">>받은 메시지 : "+recieved);
				} //while(true) end
			} catch (IOException e) {}
			finally {
				try {
					if(reader!=null)reader.close();
					if(sock!=null)sock.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


}


