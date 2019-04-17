package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx_quiz {
	//public int read(byte[] b) throws IOEXCEPTION
	//메소드를 이용한 Source.txt 파일 읽기
	public static void main(String[] args) {
		//파일 객체 생성
		File file = new File("./src/java15_io/filestream","Source.txt");
		
		//파일 입력 스트림
		FileInputStream fis = null;
		byte[] buf = new byte[1024];	//입력데이터버퍼

		//전체 읽은 데이터 저장
		StringBuffer sb = new StringBuffer();
		int in = -1; // 읽어들인 바이트수
		
		
		try {
			//파일 스트림 개설(생성)
			fis = new FileInputStream(file);
			
			//파일의 EOF까지 모든 내용을 sb에 추가
			while((in = fis.read(buf)) != -1) {
				// buf의 0인덱스부터 len 길이만큼 문자열로 생성
				String str = new String(buf,0,in);
				sb.append(str);
		
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
