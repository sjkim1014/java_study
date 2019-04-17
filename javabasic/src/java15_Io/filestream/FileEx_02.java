package java15_Io.filestream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		//절대경로
//		File file = new File("D:\\workspace\\javabasic\\src\\java15_Io\\filestream","Hello");
		
		//상대경로
//		File file = new File("./src/java15_io/filestream/Hello");
		
		File file = new File("../../FileTest.txt");
		
		System.out.println("length() : "+file.length());
		System.out.println("exists() : "+file.exists());
		
	}
}
