package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Q03_FileSenderClient_answer {
	public static void main(String[] args) {
		Socket sock = null; //��ż���
		
		PrintWriter out = null; //��½�Ʈ��
		BufferedReader in = null; //�Է½�Ʈ��
		
		//�Է´�� ����
		File file = new File("./src/java16_network/socketQuiz", "data.txt");
		
		try {
			sock = new Socket("localhost", 10007); //���� ����
			
			//��½�Ʈ�� ����
			out = new PrintWriter(sock.getOutputStream(), true);
			
			//�Է½�Ʈ�� ����
			in = new BufferedReader(new FileReader(file));
			
			//����� ���� ����
			char[] cbuf = new char[1024];
			int len = -1;
			
			//���� �Է� �� ����
			while( (len=in.read(cbuf)) != -1 ) {
				out.write(cbuf, 0, len);
			}
			
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
			try {
				if(sock!=null)	sock.close(); //���ϴݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //try end
	} //main end
}
