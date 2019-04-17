package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Q01_ReceiverServer_answer {
	public static void main(String[] args) {

		ServerSocket servSock = null; //��������
		Socket sock = null; //��ż���

		BufferedReader in = null; //�Է½�Ʈ��
		
		try {
			servSock = new ServerSocket(10005); //�������� ����
			
			while(true) {
				System.out.println("[SYSTEM] ���� Ȱ��ȭ���Դϴ�");
				System.out.println("[SYSTEM] 3...");
				System.out.println("[SYSTEM] 2...");
				System.out.println("[SYSTEM] 1...");
				System.out.println("[SYSTEM] OK...!");
				
				System.out.println("\n[SYSTEM] Listening... ["+servSock.getLocalPort()+"]");
				sock = servSock.accept(); //����
				
				//Ŭ���̾�Ʈ ���� ���� 
				InetAddress ip = sock.getInetAddress(); //Ŭ���̾�Ʈ ip����
				System.out.println("\n[SYSTEM] Ŭ���̾�Ʈ ����("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				//�Է½�Ʈ�� ����
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream())); 
	
				System.out.println();
				String recieved = null; //���� �޽���
				while( true ) { //�ݺ������� �Է¹ޱ�
					recieved = in.readLine();
					if(recieved == null) {
						System.out.println("\n[SYSTEM] ������ ��ȭ�� �����߽��ϴ�");
						break;
					}
					System.out.println(">>���� �޽��� : "+recieved);
				} //while(true) end
				
				if(in!=null)	in.close(); //�Է½�Ʈ���ݱ�
				if(sock!=null)	sock.close(); //��ż��ϴݱ�
			} //while(true) end
		} catch (IOException e) {
			e.printStackTrace();
		} //try end
	} //main end
}
