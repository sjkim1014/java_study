package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02_read {
	public static void main(String[] args) {
		InputStream is;	//�Է°�ü����
		is = System.in;	//ǥ���Է�(Ű����)��Ʈ��
		
		//�Էµ����� �����
		StringBuffer sb = new StringBuffer();
		
		int len = 0;	//�Էµ����ͱ���
		byte[] buf = new byte[4];	//�Էµ����͹���
		int total = 0 ;
		
		System.out.println("<<�Է� �����...>>");
		
		try {
			while(	(len = is.read(buf)) != -1){
			
				// buf�� 0�ε������� len ���̸�ŭ ���ڿ��� ����
				String str = new String(buf,0,len);
				sb.append(str);
				total+=len;
				
				System.out.println("len : " +len+"b");
				System.out.println("str : "+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n<<�Է� ���>>");
		System.out.println("�Է� �ѱ��� : "+total);
		System.out.println(sb);
	}
}
