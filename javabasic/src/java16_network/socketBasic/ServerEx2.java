package java16_network.socketBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) {
		ServerSocket servSock = null; // ������������
		Socket sock = null;	// ���� ��� ����
		BufferedReader in = null;	//�Է½�Ʈ��
		
		try {
			//���� �������� ����
			servSock = new ServerSocket(9988);
			System.out.println("+ + + ���� ���� ���� + + +");
			
			//Ŭ���̾�Ʈ ���� ���
			System.out.println("-----------------------");
			System.out.println("Listening Port : "+servSock.getLocalPort());
			System.out.println("-----------------------");
			sock = servSock.accept();	//Listen
			//--------BLOCKED------------
			System.out.println("Ŭ���̾�Ʈ �����");
			
			//Ŭ���̾�Ʈ IP ���� ���
			InetAddress ip = sock.getInetAddress();
			System.out.println(" >> Ŭ���̾�Ʈ IP : " + ip.getHostAddress());
			System.out.println(" >> Ŭ���̾�Ʈ port : " + sock.getPort());
			System.out.println(" >> ���� Port : "+sock.getLocalPort());
			
//			sock.getOutputStream();	//�������� �����°�			
//			sock.getInputStream();	//Ŭ���̾�Ʈ���� �޴°�
			
			//���� �Է� ��Ʈ��
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//�������Է� - Ŭ���̾�Ʈ�κ��� �ޱ�
			String str = in.readLine();
			
			System.out.println("\n>> ���۵����� : "+str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
