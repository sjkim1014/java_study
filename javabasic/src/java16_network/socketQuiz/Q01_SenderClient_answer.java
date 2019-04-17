package java16_network.socketQuiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Q01_SenderClient_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Ű���� �Է� ��ü
		
		Socket sock = null; //��ż���
		
		PrintWriter out = null; //��½�Ʈ��
		
		try {
			sock = new Socket("192.168.20.34", 10005); //���� ����
			
			//��½�Ʈ�� ����
			out = new PrintWriter(sock.getOutputStream());
			
			//�޽��� �ݺ� �Է� �� ����
			while(true) {
				//�޽��� �Է�
				System.out.print(">>�޽��� �Է� : ");
				String msg = sc.nextLine();
				
				//�޽��� �Է� �ߴ� - ���α׷� ����
				if("/EXIT".equals(msg))	break;
				
				out.println(msg); //�޽��� ����
				out.flush(); //��¹��ۺ���
			} //while(true) end
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out!=null)	out.close(); //��½�Ʈ�� �ݱ�
			if(sc!=null)	sc.close(); //�Է½�Ʈ�� �ݱ�
			
			try {
				if(sock!=null)	sock.close(); //���ϴݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //try end
	} //main end
}
