package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		//���� ��ü ����
		File file = new File("./src/java15_io/filestream","Hello");
		
		System.out.println("exists() : "+file.exists());
		
		//���� �Է� ��Ʈ��
		FileInputStream fis = null;
		
		//���� ������ �����
		StringBuffer sb = new StringBuffer();
		int in = -1; // ���� ������
		
		try {
			//���� ��Ʈ�� ����(����)
			fis = new FileInputStream(file);
			
			//������ EOF���� ��� ������ sb�� �߰�
			while((in = fis.read()) != -1) {
				sb.append((char)in);
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
