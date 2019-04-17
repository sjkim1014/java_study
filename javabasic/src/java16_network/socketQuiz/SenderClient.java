package java16_network.socketQuiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderClient {
	public static void main(String[] args) {
		Socket sock = null; //Ŭ���̾�Ʈ ��� ����
		PrintWriter out = null; //��½�Ʈ��
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			
			//autoFlush������ ���� ��½�Ʈ��
			out = new PrintWriter(sock.getOutputStream(), true);
			//������ ��� - ������ ����
			while(true) {				
				System.out.print(" >> �����޽��� �Է� : ");
				System.out.println("(����� /EXIT �Է�)");
				String str = sc.nextLine();				
				out.println(str);				
				if(str.equals("/EXIT")) {
					break;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();	//��½�Ʈ�� �ݱ�
		}
	}
}
