package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileRecieverServer {
	public static void main(String[] args) {
		ServerSocket servSock = null; // ������������
		Socket sock = null;	// ���� ��� ����
		BufferedReader in = null;	//�Է½�Ʈ��
		BufferedReader in1 = null;	//�Է½�Ʈ��
		FileOutputStream fos = null;
		File file = new File("./src/java16_network/socketQuiz","recieve.txt");
		try {
			//���� �������� ����
			fos = new FileOutputStream(file);
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
			while(true) {
				String str = in.readLine();	
				
				if(str.equals("N") || str.equals("n")){					
					sock = servSock.accept();	//Listen
					System.out.println("������");
				}else{					
					fos.write(str.getBytes());
					System.out.println("������ ����Ǿ����ϴ�.");
				}
				
			}
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
