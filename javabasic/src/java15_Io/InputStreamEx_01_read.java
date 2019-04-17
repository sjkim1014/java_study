package java15_Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		InputStream is;	//�Է°�ü ����
		
		is = System.in;	//ǥ���Է�(Ű����) ��Ʈ��
		//���� ���� �޼ҵ�
//		is.read();
//		System.in.read();
		
		//-------------------------
		//InputStream���κ��� 1����Ʈ�� �Է��� ����
		//StringBuffer��ü�� ������������
		//End of Stream(EOF)�� �����ϸ� ����
		
		//�Էµ����� �����
		StringBuffer sb = new StringBuffer();
		int in; //�Էµ����� 
		int len=0; 	//�Է±���
		
		System.out.println("�Է´����....");
		try {
			//Ű����κ����� �Է��� EOF�� ������ �ʴ´ٸ� �ݺ�
			while((in = is.read()) !=-1) {
				len++;
				//�Է¹��� ������ sb�� char������ ����
				sb.append((char)in);			
			}
			//** Ű����� ctrl+z�� ������ EOF ����Ű ����
			//^Z : EOF
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------");
		System.out.println("�Է��� ����Ʈ �� : "+len);
		System.out.println("�Է°�� : "+sb);
		
		
	}
}
