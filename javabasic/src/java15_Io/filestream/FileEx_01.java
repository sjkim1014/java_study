package java15_Io.filestream;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		//class File
		//파일 정보를 다루는 클래스
		
		String path = "D:/";
		String filename = "FileTest1.txt";
		
		File file = new File(path, filename);
		
		System.out.println(file);
		
		System.out.println("------------");
		System.out.println("length() : "+file.length());
		System.out.println("exists() : "+file.exists());
		
		System.out.println("------------");
		System.out.println("canRead() : "+ file.canRead());
		System.out.println("canWrite() : "+ file.canWrite());
		
		System.out.println("------------");
		System.out.println("isDirectory() : "+file.isDirectory());
		
	}
}
