package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Q03_FileRecieverServer_answer {
	public static void main(String[] args) {

		ServerSocket servSock = null; //��������
		Socket sock = null; //��ż���

		BufferedReader in = null; //�Է½�Ʈ��
		PrintWriter out = null; //��½�Ʈ��
		
		//��´�� ����
		File file = new File("./src/java16_network/socketQuiz", "recieve.txt");

		try {
			servSock = new ServerSocket(10007); //�������� ����
			
			while(true) {
				System.out.println("[SYSTEM] ���� Ȱ��ȭ���Դϴ�");
				System.out.println("[SYSTEM] 3...");
				System.out.println("[SYSTEM] 2...");
				System.out.println("[SYSTEM] 1...");
				System.out.println("[SYSTEM] OK...!");
				
				System.out.println("\n[SYSTEM] Listening... ["+servSock.getLocalPort()+"]");
				sock = servSock.accept(); //����
				
				//Ŭ���̾�Ʈ ���� ���� 
				InetAddress ip = sock.getInetAddress(); //Ŭ���̾�Ʈ ip����
				System.out.println("\n[SYSTEM] Ŭ���̾�Ʈ ����("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				//�Է½�Ʈ�� ����
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream())); 
	
				//��½�Ʈ�� ����, autoFlush=true
				out = new PrintWriter(new FileWriter(file), true);

				//����� ���� ����
				char[] cbuf = new char[1024];
				int len = -1;
				int total = 0;

				//��Ʈ���Է� �� ���� ���
				while( (len=in.read(cbuf)) != -1 ) {
					out.write(cbuf, 0, len);
					total+=len;
				}
				
				System.out.println("[SYSTEM] ����� ���� �� : "+total);
				System.out.println();
				
				if(in!=null)	in.close(); //�Է½�Ʈ���ݱ�
				if(out!=null)	out.close(); //��½�Ʈ���ݱ�
				if(sock!=null)	sock.close(); //��ż��ϴݱ�
			} //while(true) end
		} catch (IOException e) {
			e.printStackTrace();
		} //try end
	} //main end
}
