package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_BufferedInputStream {
	
	public static final String PATH="./src/java15_Io/filterstream";
	public static final String FILENAME="Source.txt";
	
	public static void main(String[] args) {
		
		//���� ��ü
		File file = new File(PATH,FILENAME);
		System.out.println(file.exists());
		
		//���� �Է� ��Ʈ�� ��ü ����
		FileInputStream fis = null; 	//1����Ʈ��
		BufferedInputStream bis = null;	//2����Ʈ��
		
		//���� �Է� ���� ����
		byte[] buf = new byte[1024];	//�Էµ����������
		int len = -1;	//�Էµ����ͱ���
		
		try {
			//��Ʈ�� ����
			fis = new FileInputStream(file);	//1�� ��Ʈ��
			bis = new BufferedInputStream(fis); 	//2����Ʈ��
			
			while((len=bis.read(buf))!=-1) {
				System.out.print(new String(buf,0,len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(bis!=null)
				bis.close();
				if(fis!=null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

















