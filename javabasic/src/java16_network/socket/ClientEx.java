package java16_network.socket;

import java.io.IOException;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		Socket sock = null; //Ŭ���̾�Ʈ ��� ����
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			//127.0.0.1:9988 �� ���ӿ�û ������
			sock = new Socket("127.0.0.1",9988);
//			sock = new Socket("localHost",9988);
			
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
