package java15_Io.charstream;
//+ ���ڽ�Ʈ�� �̿� FileCopy
//
//- Source.txt ������ Dest.txt ���Ϸ� �����Ѵ�
// ( Source.txt�� ũ�� = 4250 Bytes )
//
//- BufferedReader �� BufferedWriter �� �̿�
//
//- ���ڴ����� �ϳ��� �����ϰ� �ȴ�
// ( BufferedReader.read(char[]) �޼ҵ带 �̿��ϸ�
//  ���̴� �� ����Ʈ�� �ƴ� �� ���ڼ��� ���´�)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//1. ����� ���
//- File Src, Dest; //������ ���纻
//
//2. ����� ��Ʈ�� ����
//- BufferedReader br;
//- BufferedWriter bw;
//
//3. ����� ó�� (try-catch ����)
//3-1. ����� ��Ʈ�� ����
//  - FileReader�� �̿��Ͽ� BufferedReader ����
//  - FileWriter�� �̿��Ͽ� BufferedWriter ����
//
//3-2. ����� (while ����)
//  - read �� �о�鿩�� write�� ���
//  - ������ ���� �� ���� (total)
//
//3-3. ���� ó�� �� close
//
//4. ������ ���� �� ���
public class CharStream_FileCopy_Quiz {
	public static final String PATH = "./src/java15_Io/charstream";
	public static final String SRC ="Source.txt";
	public static final String DEST ="Desc.txt";
	public static void main(String[] args) {

		File file = new File(PATH,SRC);
		File file1 = new File(PATH,DEST);
		BufferedReader bis = null;
		BufferedWriter bos = null;
		char[] cbuf = new char[1024];
		String str = null;
		int len = -1;
		int total=0;
	
		try {			
			bis = new BufferedReader(new FileReader(file));
			bos = new BufferedWriter(new FileWriter(file1,false));
			
//			while((len=bis.read(cbuf))!=-1){				
//				bos.write(cbuf, 0, len);				
//				total+=len;				
//			}	
			while((str=bis.readLine())!=null){				
				bos.write(str);
				bos.newLine();
				total+=str.length();			
			}	
			bos.flush();
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
				if(bos!=null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//12. ������ ����Ʈ �� ���
		System.out.println(total);
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
		
	}
}
