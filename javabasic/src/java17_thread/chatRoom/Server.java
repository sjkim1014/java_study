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
//**Server�� ����Ŭ����
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
//>> ������
//	���� ����
//	
//>> run() �޼ҵ�
//	1. ���� �Է½�Ʈ�� ����
//	
//	2. �޽��� �Է¹ޱ�
//	3. �Է¹��� �޽��� ���(�α�)
//	4. �Է¹��� �޽��� ������ ���� ó��
//	4-1. �޽��� == null
//		�α׾ƿ�
//	4-2. �޽���.contains("_ID_IS_") == true
//		�α���
//	4-3. 4-1,4-2 ������ �ƴ� ��
//		�⺻ �޽���
//	(2~4 �ݺ�)
//	5. writerToClients �ʿ���
//		�α׾ƿ��� clientID�� remove()
//	6. ���� close()
//	
//
//4-1�� ���� ����
//	Ŭ���̾�Ʈ�� ������ ���� ����̴�(EOF)
//	
//	clientID+" �α׾ƿ�" ����� ��� (�α�)
//	
//	 writerToClients ���� �ڽ� ���� ��� ��½�Ʈ������
//	clientID+"���� ä�ù��� �����̽��ϴ�" ��� (�˸�)
//
//	�ݺ� �ߴ�
//	
//
//4-2�� ���� ����
//	�޽���.split("_ID_IS_") ����
//	
//	�޽������� clientID ���ؼ� ����
//	
//	writerToClients�� {clientID:��½�Ʈ��} �������� put
//	
//	clientID+" �α���" ����� ��� (�α�)
//	
//	 writerToClients ���� �ڽ� ���� ��� ��½�Ʈ������
//	clientID+"���� ä�ù濡 �����ϼ̽��ϴ�" ��� (�˸�)
//	
//	�ݺ� �̾
//
//
//4-3�� ���� ����
//	 writerToClients ���� �ڽ� ���� ��� ��½�Ʈ������
//	clientID+"> �޽���" ��� (ä�� ����)

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
//>> main() �޼ҵ�
//	Server ��ü ����
//	initChatRoom() ȣ��
//	
//>> initChatRoom() �޼ҵ�
//	1. writerToClients �� ����
//	2. �������� ���� ����
//	
//	3. Ŭ���̾�Ʈ LISTEN �� ��ż��� ����
//	4. ClientManager ��ü ����
//	5. ClientManager�� ��ż��� ����
//	6. ClientManager ������ Ȱ��ȭ
//	
//	4~6 �ݺ�

public class Server {
	private static final int PORT = 10006;
	private Map<String, PrintWriter> writerToClients = new HashMap<String, PrintWriter>();
	
	public void initChatRoom() {
		ServerSocket serv = null;
		Socket sock = null;
		
		try {
			serv = new ServerSocket(PORT);
			
			while(true) {
				System.out.println("���� ����");
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
			BufferedReader in = null; //�Է½�Ʈ��
			PrintWriter writer = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				writer = new PrintWriter(sock.getOutputStream());
				InetAddress ip = sock.getInetAddress(); //Ŭ���̾�Ʈ ip����
				System.out.println("\n[SYSTEM] Ŭ���̾�Ʈ ����("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				System.out.println();
				String recieved = null; //���� �޽���
				while( true ) { //�ݺ������� �Է¹ޱ�
					recieved = in.readLine();
					if(recieved == null) {
						System.out.println(clientID[1]+"���� �α׾ƿ��߽��ϴ�");
						break;
					}else if(recieved.contains("_ID_IS_") == true) {
						clientID = recieved.split("_ID_IS_",2);
						System.out.println(clientID[1]+"���� �α����߽��ϴ�.");
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
