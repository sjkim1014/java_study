package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//+ ���� ����, File Copy
//- FileCopy.java �� ���� �ذ��Ѵ�
//
//- Source.txt ������ Dest.txt ���Ϸ� �����Ѵ�
//
//- ���α׷� ����
//
//	1. ���� ��ü ���� ( Source.txt, Dest.txt )
//	2. ���� �Է�,��� ��Ʈ�� ��ü ����
//	3. byte[1024] ���� ����
//
//	4. ���� ����� ��Ʈ�� ��ü ����
//	5. read(byte[]) , write(byte[], int, int) �� �̿��Ͽ� ����
//	  ��, 5���� while���� �̿��Ͽ� ������ ������ ����ǵ�����
//	  �߰�������, "���� �Ϸ�, ?? Byte"��� ���
//	6. ��Ʈ�� close()
//
//	-> 4, 5, 6 ����ó�� ������
//	-> e.printStackTrace() ����� ���� ��Ȳ ����Ұ�
//	->	ex) [ERROR] ���Ͻ�Ʈ�� ���� ����

public class FileCopy {
	public static void main(String[] args) {
		File file = new File("./src/java15_Io/filestream","Source.txt");
		File file2 = new File("./src/java15_Io/filestream","Desc.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1024];	//�ӽ������
		int len=-1;		
		int total=0;	//������ѱ椷
		
		
		try {
			fis = new FileInputStream(file);
			
			while((len=fis.read(buf))!= -1) {				
				String str = new String(buf,0,len);
				sb.append(str.toLowerCase());
				buf = str.getBytes();	
				
				fos = new FileOutputStream(file2,true);
				fos.write(buf, 0, len);
				
				total+=len;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[Error] ���� ����");
		} catch (IOException e) {
			System.out.println("[Error] ���� ����� ����");
		}finally {
			try {
				//���ϴݱ�, ������½�Ʈ���ڿ� ����, ������Ʈ�ͼ��Ƕ����� ��
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();				
			} catch (IOException e) {
				System.out.println("[Error] ���� �ݱ� ����");
		
			}
		}
		System.out.println(total + "byte");
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
