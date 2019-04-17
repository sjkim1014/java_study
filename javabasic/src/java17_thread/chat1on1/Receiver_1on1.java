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
////��ż���
//- sock: Socket
//
//// �����Է�
//- reader : BufferedReader
//
//// ��������
//- writer : PrintWriter
//
//// ������
//+ Receiver_1on1(Socket)
//
//// run() Override
//// �����Է� -> ��������

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
					System.out.println("\n���� ������ ����");				
					break;
				}
				System.out.println(">>���� �޽��� : "+recieved);
			} //while(true) end
			if(sock!=null)sock.close();
			if(reader!=null)reader.close();			
				
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

