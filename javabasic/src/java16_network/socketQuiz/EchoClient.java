package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		Socket sock = null; //Ŭ���̾�Ʈ ��� ����
		PrintWriter out = null; //��½�Ʈ��
		BufferedReader in = null;	//�Է½�Ʈ��
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			
			//autoFlush������ ���� ��½�Ʈ��
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
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
				String str1 = in.readLine();
				System.out.println("\n>> �ݼ۵����� : "+str1);
				System.out.println();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();	//��½�Ʈ�� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//��½�Ʈ�� �ݱ�
		}
	}
}
