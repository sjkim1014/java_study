package java17_thread.chat1on1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//+ Client_1on1 extends Chatting
//// ������
//+ Client_1on1()
//	Socket ����
//	chat(Socket);
//
//+ chat(Socket): void
//   new Sender(Socket).start();
//   new Receiver(Socket).start();
//
//+ main()
//	new Client_1on1();

public class Client_1on1{
	public Client_1on1() {
		
		Socket sock = null;
		try {
			sock = new Socket("localhost", 10006);
			System.out.println("Ŭ���̾�Ʈ ����");
			chat(sock);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //���� ����
		
	}
	
	public void chat(Socket sock) {
		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
	
	}
	public static void main(String[] args) {
		new Client_1on1();
	}
}
