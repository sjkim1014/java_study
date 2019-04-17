package java16_network.socketBasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket sock = null; //Ŭ���̾�Ʈ ��� ����
		PrintWriter out = null; //��½�Ʈ��
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			//127.0.0.1:9988 �� ���ӿ�û ������
			sock = new Socket("127.0.0.1",9988);
//			sock = new Socket("localHost",9988);
			
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			
//			sock.getInputStream();	//�������� �°� �޴°�			
//			sock.getOutputStream();	//Ŭ���̾�Ʈ���� �����°�
			
			//autoFlush������ ���� ��½�Ʈ��
			out = new PrintWriter(sock.getOutputStream(), true);
			//������ ��� - ������ ����
			out.println("Hello, Server");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();	//��½�Ʈ�� �ݱ�
		}
	}
}
