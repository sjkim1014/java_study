package java15_Io.filestream;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		File file = new File("D:\\Apple\\Banana\\Cherry");
		
		System.out.println("exists() : "+file.exists());
		
		//file.mkdir(); // 폴더만들기, 마지막 단계만 생성
		file.mkdirs(); //폴더만들기, 중간단계까지 전부생성
	}
}
