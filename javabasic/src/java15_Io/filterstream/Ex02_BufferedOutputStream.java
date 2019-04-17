package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_BufferedOutputStream {
	
	public static final String PATH="./src/java15_Io/filterstream";
	public static final String FILENAME="TestOutPut";
	
	public static void main(String[] args) {
		//���ϰ�ü
		File file = new File(PATH,FILENAME);
		
		//��½�Ʈ�� ����
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//��½�Ʈ�� ����
			fos = new FileOutputStream(file);		//1����Ʈ��
			bos = new BufferedOutputStream(fos);	//2����Ʈ��
			
			//���
			
			bos.write("�ȳ��ϼ��� �ڹ��ڹ�".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}

















