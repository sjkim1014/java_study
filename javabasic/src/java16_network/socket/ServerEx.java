package java16_network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket servSock = null; // ������������
		Socket sock = null;	// ���� ��� ����
		
		try {
			//���� �������� ����
			servSock = new ServerSocket(9988);
			System.out.println("+ + + ���� ���� ���� + + +");
			
			//Ŭ���̾�Ʈ ���� ���
			System.out.println("Listening....");
			sock = servSock.accept();	//Listen
			//--------BLOCKED------------
			System.out.println("Ŭ���̾�Ʈ �����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
