package java15_Io.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java15_Io/filestream", "Result");
		
		//파일 출력 스트림 선언
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024]; //출력데이터 저장소
//		int len = 0;
//		buf[len++]='A';
//		buf[len++]='B';
//		buf[len++]='C';
		
		String str = "안녕하세요 출력잘되나요";
		buf = str.getBytes();
		int len = buf.length;
		
		try {
			//파일출력스트림 개설 (true: 추가, false: 쓰기)
			fos = new FileOutputStream(file, true);
			fos.write(buf, 0, len);
		} catch (FileNotFoundException e) {
			System.out.println("[Error] 파일 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[Error] 입출력 문제 발생");
			e.printStackTrace();
		}finally {
			try {
				//파일닫기, 파일출력스트림자원 해제, 널포인트익셉션때문에 씀
				if(fos!=null) fos.close();
			} catch (IOException e) {
				System.out.println("[Error] 파일 닫기 실패");
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
