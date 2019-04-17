package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		//파일 객체 생성
		File file = new File("./src/java15_io/filestream","Hello");
		
		System.out.println("exists() : "+file.exists());
		
		//파일 입력 스트림
		FileInputStream fis = null;
		
		//읽은 데이터 저장소
		StringBuffer sb = new StringBuffer();
		int in = -1; // 읽은 데이터
		
		try {
			//파일 스트림 개설(생성)
			fis = new FileInputStream(file);
			
			//파일의 EOF까지 모든 내용을 sb에 추가
			while((in = fis.read()) != -1) {
				sb.append((char)in);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[ERROR] 파일 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[ERROR] 입력 문제 발생");
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[ERROR] 파일 닫기 실패");
				e.printStackTrace();
			}
		}
		System.out.println("====읽어들인 데이터====");
		System.out.println(sb);
		System.out.println("===================");
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}
