package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Q02_EchoClient_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Ű���� �Է� ��ü
		
		Socket sock = null; //��ż���
		
		PrintWriter out = null; //��½�Ʈ��
		BufferedReader in = null; //�Է½�Ʈ��
		
		try {
			sock = new Socket("localhost", 10006); //���� ����
			
			//��½�Ʈ�� ����
			out = new PrintWriter(sock.getOutputStream());
			
			//�Է½�Ʈ�� ����
			in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			//�޽��� �ݺ� �Է� �� ����
			while(true) {
				//�޽��� �Է�
				System.out.print(">>�޽��� �Է� : ");
				String msg = sc.nextLine();
				
				//�޽��� �Է� �ߴ� - ���α׷� ����
				if("/EXIT".equals(msg))	break;
				
				out.println(msg); //�޽��� ����
				out.flush(); //��¹��ۺ���
				
				//�ݼ۸޽��� ó��
				String recieved = in.readLine();
				System.out.println("\t>>�ݼ۸޽��� : "+recieved);
				System.out.println();
				
			} //while(true) end
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close(); //�Է½�Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
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
