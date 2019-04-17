package java15_Io.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		//��� ��� ����
		File file = new File("./src/java15_Io/filestream", "Result");
		
		//���� ��� ��Ʈ�� ����
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024]; //��µ����� �����
//		int len = 0;
//		buf[len++]='A';
//		buf[len++]='B';
//		buf[len++]='C';
		
		String str = "�ȳ��ϼ��� ����ߵǳ���";
		buf = str.getBytes();
		int len = buf.length;
		
		try {
			//������½�Ʈ�� ���� (true: �߰�, false: ����)
			fos = new FileOutputStream(file, true);
			fos.write(buf, 0, len);
		} catch (FileNotFoundException e) {
			System.out.println("[Error] ���� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[Error] ����� ���� �߻�");
			e.printStackTrace();
		}finally {
			try {
				//���ϴݱ�, ������½�Ʈ���ڿ� ����, ������Ʈ�ͼ��Ƕ����� ��
				if(fos!=null) fos.close();
			} catch (IOException e) {
				System.out.println("[Error] ���� �ݱ� ����");
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
