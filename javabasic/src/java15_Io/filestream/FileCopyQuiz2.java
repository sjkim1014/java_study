package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//+ ���� ����2, File Copy2
//- Lower.txt ������ Upper.txt�� �����Ѵ�
//
//- Lower.txt���� ���� ���ڰ� �ҹ��ڶ�� �빮�ڷ� ��ȯ�Ѵ� 
public class FileCopyQuiz2 {
	public static void main(String[] args) {
		File file = new File("./src/java15_Io/filestream","Lower.txt");
		File file2 = new File("./src/java15_Io/filestream","Upper.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1];	//�ӽ������
		int len=-1;		
		int total=0;	//������ѱ���
		String str;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			while((len=fis.read(buf))!= -1) {	
				if('A'<=buf[0] && buf[0]<='Z') {
					str=new String(buf,0,len);					
					buf = str.toLowerCase().getBytes();					
				}else if('a'<=buf[0] && buf[0]<='z') {
					str=new String(buf,0,len);					
					buf = str.toUpperCase().getBytes();					
				}
				
				fos.write(buf, 0, len);
				
				System.out.println("-----------");
				System.out.println("��������Ʈ�Ǽ� " + len);
				
				
				total+=len;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[Error] �Է� ���� ����");
			System.out.println("[Error] ��������� �����Ҽ�����");
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
		System.out.println("������ �� ����Ʈ�� "+total + "byte");
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
