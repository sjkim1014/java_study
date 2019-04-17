package java17_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//+ Receiver_1on1 extends Thread
////통신소켓
//- sock: Socket
//
//// 소켓입력
//- reader : BufferedReader
//
//// 모니터출력
//- writer : PrintWriter
//
//// 생성자
//+ Receiver_1on1(Socket)
//
//// run() Override
//// 소켓입력 -> 모니터출력

public class Receiver_1on1 extends Thread{
	private Socket sock = null;
	private BufferedReader reader = null;
	
	public Receiver_1on1(Socket sock) {		
		this.sock = sock;
			
	}
	@Override
	public void run() {
		try {			
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String recieved = null; 
			while( true ) { 
				recieved = reader.readLine();
				if(recieved == null) {
					System.out.println("\n상대방 연결이 끊김");				
					break;
				}
				System.out.println(">>받은 메시지 : "+recieved);
			} //while(true) end
			if(sock!=null)sock.close();
			if(reader!=null)reader.close();			
				
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

