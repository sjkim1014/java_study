package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_BufferedInputStream {
	
	public static final String PATH="./src/java15_Io/filterstream";
	public static final String FILENAME="Source.txt";
	
	public static void main(String[] args) {
		
		//파일 객체
		File file = new File(PATH,FILENAME);
		System.out.println(file.exists());
		
		//파일 입력 스트림 객체 선언
		FileInputStream fis = null; 	//1차스트림
		BufferedInputStream bis = null;	//2차스트림
		
		//파일 입력 보조 변수
		byte[] buf = new byte[1024];	//입력데이터저장소
		int len = -1;	//입력데이터길이
		
		try {
			//스트림 생성
			fis = new FileInputStream(file);	//1차 스트림
			bis = new BufferedInputStream(fis); 	//2차스트림
			
			while((len=bis.read(buf))!=-1) {
				System.out.print(new String(buf,0,len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(bis!=null)
				bis.close();
				if(fis!=null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

















