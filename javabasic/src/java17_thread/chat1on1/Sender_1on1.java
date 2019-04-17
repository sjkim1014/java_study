package java17_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//+ Sender_1on1 extends Thread
//// ��ż���
//- sock: Socket
//	
//// Ű�����Է�
//- reader: BufferedReader
//	"/EXIT" �Է� �� ����
//	
//// �������
//- writer: PrintWriter
//	
//// ������
//+ Sender_1on1(Socket)
//
//// run() Override
//// Ű�����Է� -> �������


public class Sender_1on1 extends Thread{
	private Socket sock=null;
	private BufferedReader reader=null;
	private PrintWriter writer = null;
	Scanner sc = new Scanner(System.in);
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		try {
			
			writer = new PrintWriter(sock.getOutputStream(),true);
			
			while(true) {
				//�޽��� �Է�
				String msg = sc.nextLine();
				
				//�޽��� �Է� �ߴ� - ���α׷� ����
				if("/EXIT".equals(msg))	{
					System.out.println("+ + ��� ���� + +");
					break;
				}
				
				writer.println(msg); //�޽��� ����
				writer.flush(); //��¹��ۺ���
				

				
			} //while(true) end
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sc!=null)sc.close();
			if(writer!=null)writer.close();
		}
	}
}
