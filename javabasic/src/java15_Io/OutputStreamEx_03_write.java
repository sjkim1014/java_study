package java15_Io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {
	public static void main(String[] args) {
		OutputStream os;	//��°�ü ����	
		os = System.out;	//ǥ�����(�����) ��Ʈ��
		
		byte[] buf = new byte[1024];
		int len = 0;	//�ǹ��ִ� �������� ����
		
		buf[len++] = 65;
		buf[len++] = 66;
		buf[len++] = 67;
		buf[len++] = 10;
		
		buf[len++] = 'H';
		buf[len++] = 'o';
		buf[len++] = 'l';
		buf[len++] = 'a';
		buf[len++] = '\n';
		
		try {
			os.write(buf,0,len);
						
			String str = "Hello";
			byte[] tmp = str.getBytes();
			os.write(tmp);
			os.flush();// ��¹��ۺ���
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("+ + + ���α׷� ���� + + +");
	}
	
}
