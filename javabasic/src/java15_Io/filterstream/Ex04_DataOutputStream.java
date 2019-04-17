package java15_Io.filterstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {
	public static void main(String[] args) {
		//���ϰ�ü����
		File file = new File("./src/java15_Io/filterstream",
				"DataStreamTest");
		
		//���� ��� ��Ʈ�� ��ü ����
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//������ ���
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeChar('T');
			dos.writeChars("�ȳ�!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

















