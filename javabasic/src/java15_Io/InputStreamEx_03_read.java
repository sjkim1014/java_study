package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_03_read {
	public static void main(String[] args) {
		InputStream is;	//�Է°�ü����
		is = System.in;	//ǥ���Է�(Ű����)��Ʈ��
		
		//�Էµ����� �����
		StringBuffer sb = new StringBuffer();
		int len=0;	//�Է� ������ ����
		byte[] buf = new byte[1024];	//�Էµ����� ����
		
		System.out.println("<<�Է´����...>>");
		
		try {
			while((len = is.read(buf, 0, buf.length))!= -1) {
				//buf�迭���� �Է¹��� �����͸� ���ڿ��� ��ȯ
				String str = new String(buf,0,len);
				
				sb.append(str);	//�Է¹��� ������ sb�� �߰�
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n<<�Է°��>>");
		System.out.println(sb);
	}
	
}
