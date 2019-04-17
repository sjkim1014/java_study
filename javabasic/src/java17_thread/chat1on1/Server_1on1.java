package java17_thread.chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//+ Server_1on1 class
//// ������
//+ Server_1on1()
//	ServerSocket ����
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
	
			System.out.println("+ + ���� ���� + +");
			System.out.println("Ŭ���̾�Ʈ �����");
						
				sock = servSock.accept(); //����
				
				//Ŭ���̾�Ʈ ���� ���� 
				InetAddress ip = sock.getInetAddress(); //Ŭ���̾�Ʈ ip����
				System.out.println("\nŬ���̾�Ʈ ����("
						+ip.getHostAddress()+")");
				
				chat(sock);
			
		} catch (IOException e) {
			System.out.println("�������");
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
