package java17_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//-------------------------
//**Client�� ����Ŭ����
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
//>> ������
//	���� ����
//>> run() �޼ҵ�
//	1.Ű���� �Է� ��Ʈ�� ����
//	2.���� ��� ��Ʈ�� ����
//	
//	3. ����ڿ��� ���̵� �Է¹ޱ�
//	4. "CLIENT_ID_IS_"+���̵� �������� ������� (�α���)
//
//	5. ����ڿ��� �޽��� �Է¹ޱ�
//	6. �޽��� ������� (ä��)
//	5~6 �ݺ�
//	7. "exit" �Է½� �ݺ� �ߴ�
//	
//	8. ��Ʈ��, ���� �ݱ� (�α׾ƿ�)


	
//-------------------------
//**Client�� ����Ŭ����
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
//>> ������
//	���� ����
//
//>> run() �޼ҵ�
//	���� �Է� ��Ʈ�� ����
//	
//	�޽��� �Է� �� ����� ��� (�ݺ�)
	

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
//>> ������
//	��ü ����
//	initClient() ȣ��
//
//>> initClient() �޼ҵ�
//	���� ����
//	chat() ȣ��
//
//>> chat() �޼ҵ�
//	Receiver ��ü ���� �� ������ Ȱ��ȭ
//	Sender ��ü ���� �� ������ Ȱ��ȭ
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
				System.out.print("���̵� �Է��ϼ��� : ");
				String id = "CLIENT_ID_IS_"+sc.nextLine();			
				writer.println(id);
				//�޽��� �ݺ� �Է� �� ����
				while(true) {
					//�޽��� �Է�
					System.out.print(">>�޽��� �Է� : ");
					String msg = sc.nextLine();
					
					//�޽��� �Է� �ߴ� - ���α׷� ����
					if("exit".equals(msg))	break;
					
					writer.println(msg); //�޽��� ����
					writer.flush(); //��¹��ۺ���
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
				String recieved = null; //���� �޽���
				while( true ) { //�ݺ������� �Է¹ޱ�
					recieved = reader.readLine();
					if(recieved == null) {
						System.out.println("\n[SYSTEM] ������ ��ȭ�� �����߽��ϴ�");
						break;
					}
					System.out.println(">>���� �޽��� : "+recieved);
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


