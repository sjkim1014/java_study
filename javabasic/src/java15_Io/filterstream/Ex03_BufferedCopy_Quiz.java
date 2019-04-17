package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedCopy_Quiz {
	//1. PATH ���
	//2. SRC ���
	//3. DEST ���
	public static final String PATH = "./src/java15_Io/filterStream";
	public static final String SRC ="Source.txt";
	public static final String DEST ="Dest.txt";
	public static void main(String[] args) {
		//4. ���� ��ü
		//5. ����� ��Ʈ�� ��ü ����
		//6. ���� ����� ���� ����
		File file = new File(PATH,SRC);
		File file1 = new File(PATH,DEST);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[1024];
		int len = -1;
		try {
			//7. ���� ����� ��Ʈ�� ����
			//8. ���� �Է� {
				//���� ���
				// ����ī�� �� ����
			// }
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file1);
			bos = new BufferedOutputStream(fos);
			
			while((len=bis.read(buf))!=-1){
				System.out.print(new String(buf,0,len));
				bos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			//9. ���� ���
			System.out.println("������ ����");
		} catch (IOException e) {
			//10. ���� ���
			System.out.println("����� ���� ����");
		} finally {
			//11. ��Ʈ�� �ݱ�
				//����ó��
			
				try {
					if(bis!=null) bis.close();
					if(fis!=null) fis.close();
					if(bos!=null) bos.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//12. ������ ����Ʈ �� ���
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
		
	}
}

















