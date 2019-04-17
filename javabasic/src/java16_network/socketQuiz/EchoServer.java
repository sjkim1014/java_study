package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		ServerSocket servSock = null; // ������������
		Socket sock = null;	// ���� ��� ����
		BufferedReader in = null;	//�Է½�Ʈ��
		PrintWriter out = null; //��½�Ʈ��
		String str = null;
		
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
			
			
//			sock.getOutputStream();	//�������� �����°�			
//			sock.getInputStream();	//Ŭ���̾�Ʈ���� �޴°�
			
			//���� �Է� ��Ʈ��
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(), true);
			//�������Է� - Ŭ���̾�Ʈ�κ��� �ޱ�
			while(true) {
				str = in.readLine();
				
//				System.out.println("\n>> ���۵����� : "+str);				
				if(str.equals("/EXIT")) {
					sock = servSock.accept();
				}else {
					out.println(str);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
