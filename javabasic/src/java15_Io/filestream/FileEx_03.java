package java15_Io.filestream;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		File file = new File("D:\\Apple\\Banana\\Cherry");
		
		System.out.println("exists() : "+file.exists());
		
		//file.mkdir(); // ���������, ������ �ܰ踸 ����
		file.mkdirs(); //���������, �߰��ܰ���� ���λ���
	}
}
