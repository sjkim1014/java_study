package java17_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//+ Sender_1on1 extends Thread
//// 통신소켓
//- sock: Socket
//	
//// 키보드입력
//- reader: BufferedReader
//	"/EXIT" 입력 시 종료
//	
//// 소켓출력
//- writer: PrintWriter
//	
//// 생성자
//+ Sender_1on1(Socket)
//
//// run() Override
//// 키보드입력 -> 소켓출력


public class Sender_1on1 extends Thread{
	private Socket sock=null;
	private BufferedReader reader=null;
	private PrintWriter writer = null;
	Scanner sc = new Scanner(System.in);
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		try {
			
			writer = new PrintWriter(sock.getOutputStream(),true);
			
			while(true) {
				//메시지 입력
				String msg = sc.nextLine();
				
				//메시지 입력 중단 - 프로그램 종료
				if("/EXIT".equals(msg))	{
					System.out.println("+ + 통신 종료 + +");
					break;
				}
				
				writer.println(msg); //메시지 전송
				writer.flush(); //출력버퍼비우기
				

				
			} //while(true) end
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sc!=null)sc.close();
			if(writer!=null)writer.close();
		}
	}
}
