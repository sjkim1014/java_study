package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx_quiz {
	//public int read(byte[] b) throws IOEXCEPTION
	//�޼ҵ带 �̿��� Source.txt ���� �б�
	public static void main(String[] args) {
		//���� ��ü ����
		File file = new File("./src/java15_io/filestream","Source.txt");
		
		//���� �Է� ��Ʈ��
		FileInputStream fis = null;
		byte[] buf = new byte[1024];	//�Էµ����͹���

		//��ü ���� ������ ����
		StringBuffer sb = new StringBuffer();
		int in = -1; // �о���� ����Ʈ��
		
		
		try {
			//���� ��Ʈ�� ����(����)
			fis = new FileInputStream(file);
			
			//������ EOF���� ��� ������ sb�� �߰�
			while((in = fis.read(buf)) != -1) {
				// buf�� 0�ε������� len ���̸�ŭ ���ڿ��� ����
				String str = new String(buf,0,in);
				sb.append(str);
		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[ERROR] ���� �������� ����");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[ERROR] �Է� ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[ERROR] ���� �ݱ� ����");
				e.printStackTrace();
			}
		}
		System.out.println("====�о���� ������====");
		System.out.println(sb);
		System.out.println("===================");
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}
