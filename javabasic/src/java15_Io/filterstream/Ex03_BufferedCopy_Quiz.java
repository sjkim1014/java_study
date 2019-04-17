package java15_Io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedCopy_Quiz {
	//1. PATH 상수
	//2. SRC 상수
	//3. DEST 상수
	public static final String PATH = "./src/java15_Io/filterStream";
	public static final String SRC ="Source.txt";
	public static final String DEST ="Dest.txt";
	public static void main(String[] args) {
		//4. 파일 객체
		//5. 입출력 스트림 객체 선언
		//6. 파일 입출력 보조 변수
		File file = new File(PATH,SRC);
		File file1 = new File(PATH,DEST);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[1024];
		int len = -1;
		try {
			//7. 파일 입출력 스트림 개설
			//8. 파일 입력 {
				//파일 출력
				// 파일카피 총 길이
			// }
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file1);
			bos = new BufferedOutputStream(fos);
			
			while((len=bis.read(buf))!=-1){
				System.out.print(new String(buf,0,len));
				bos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			//9. 에러 출력
			System.out.println("파일이 없음");
		} catch (IOException e) {
			//10. 에러 출력
			System.out.println("입출력 문제 있음");
		} finally {
			//11. 스트림 닫기
				//예외처리
			
				try {
					if(bis!=null) bis.close();
					if(fis!=null) fis.close();
					if(bos!=null) bos.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//12. 복사한 바이트 수 출력
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
		
	}
}

















