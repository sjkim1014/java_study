package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class FileSenderClient {
	public static void main(String[] args) {
		String str1=null;
		Socket sock = null; //Ŭ���̾�Ʈ ��� ����
		PrintWriter out = null; //��½�Ʈ��
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = null;	//�Է½�Ʈ����ü
		File file = new File("./src/java16_network/socketQuiz","Data.txt");
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			
			//autoFlush������ ���� ��½�Ʈ��
			out = new PrintWriter(sock.getOutputStream(), true);
			//������ ��� - ������ ����
			
			//�Է½�Ʈ�� ���� ����
			int len = -1; 	//�Էµ������� ����
			char[] cbuf = new char[1024];//�Է½�Ʈ�� ����
			//���� ��� ��Ʈ�� ����
			reader = new BufferedReader(new FileReader(file));
			
			while(true) {				
				System.out.println("�������� Y/N");
				String str = sc.nextLine();		
				
				if(str.equals("Y") || str.equals("y")){
					while((len=reader.read(cbuf))!= -1) {
						str1=new String(cbuf,0,len);
						out.println(str1);
					}
				}else if(str.equals("N") || str.equals("n")){
					System.out.println("���� ������ �����ϴ�.");
					out.println(str);
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
