package java15_Io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
		OutputStream os;	//��°�ü ����	
		os = System.out;	//ǥ�����(�����) ��Ʈ��
		
		//PrintStream out -> OutputStreadm os
		
		try {
			os.write(97);	// 'a'			
			os.write(98);	// 'b'
			os.write(99);	// 'c'
			os.write(13);	//\r
			os.write(10);	//\n
			
			os.write('H');
			os.write('i');
			os.write('\n');
			//flush���� ������
			//��½�Ʈ���� ��¹��ۿ��� �����Ͱ� ���۵ǰ� �P��
			//flush�� ���؝۸� �����ġ���� ���۵�
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("+ + + ���α׷� ���� + + +");
	}
	
}
