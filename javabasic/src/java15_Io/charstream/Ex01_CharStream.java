package java15_Io.charstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex01_CharStream {
	public static void main(String[] args) {
		//InputStreamReader
		//InputStream -> Reader
		//����Ʈ��Ʈ�� -> ���ڽ�Ʈ��
		
		//OutputStreamWriter
		//OutputStream -> Writer
		//����Ʈ��Ʈ�� -> ���ڽ�Ʈ��
		
		//ǥ���Է� ��Ʈ��- > ���ڽ�Ʈ��
		Reader rd = new InputStreamReader(System.in);
		
		//ǥ����½�Ʈ�� -> ���ڽ�Ʈ��
		Writer wt = new OutputStreamWriter(System.out);
		//�Է��ѹ���
		int in = -1;
		
		try {
			while((in=rd.read())!=-1) {
				wt.write(in);
//				wt.flush(); //1�پ� flush, enter�� ��������
			}
			wt.flush(); //�Է��� ��系�� flush, EOF�� ��������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(rd!=null) rd.close();
				if(wt!=null) wt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
