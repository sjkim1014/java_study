package java15_Io.filterstream;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class Ex01_FilterStream {
	public static void main(String[] args) {
		FilterInputStream fis; 	//�����Է½�Ʈ�� ��ü ����
		
		// protected ���������ڰ� �ο��� �����ڸ� ������ �־� ��ü ���� �Ұ�
//		fis = new FilterInputStream(System.in);
		
		FilterOutputStream fos;	//������½�Ʈ�� ��ü ����
		
		// FilterOutputStream ��ü�� ���� ������� ����
		// ����Ŭ�������� Ȱ����
		fos = new FilterOutputStream(System.out);
	}
}
