package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//+ 파일 복사, File Copy
//- FileCopy.java 를 만들어서 해결한다
//
//- Source.txt 파일을 Dest.txt 파일로 복사한다
//
//- 프로그램 절차
//
//	1. 파일 객체 생성 ( Source.txt, Dest.txt )
//	2. 파일 입력,출력 스트림 객체 선언
//	3. byte[1024] 버퍼 생성
//
//	4. 파일 입출력 스트림 객체 생성
//	5. read(byte[]) , write(byte[], int, int) 를 이용하여 복사
//	  단, 5번은 while문을 이용하여 파일의 끝까지 복사되도록함
//	  추가적으로, "복사 완료, ?? Byte"라고 출력
//	6. 스트림 close()
//
//	-> 4, 5, 6 예외처리 적절히
//	-> e.printStackTrace() 지우고 직접 상황 출력할것
//	->	ex) [ERROR] 파일스트림 생성 실패

public class FileCopy {
	public static void main(String[] args) {
		File file = new File("./src/java15_Io/filestream","Source.txt");
		File file2 = new File("./src/java15_Io/filestream","Desc.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1024];	//임시저장소
		int len=-1;		
		int total=0;	//복사된총길ㅇ
		
		
		try {
			fis = new FileInputStream(file);
			
			while((len=fis.read(buf))!= -1) {				
				String str = new String(buf,0,len);
				sb.append(str.toLowerCase());
				buf = str.getBytes();	
				
				fos = new FileOutputStream(file2,true);
				fos.write(buf, 0, len);
				
				total+=len;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[Error] 파일 없음");
		} catch (IOException e) {
			System.out.println("[Error] 파일 입출력 실패");
		}finally {
			try {
				//파일닫기, 파일출력스트림자원 해제, 널포인트익셉션때문에 씀
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();				
			} catch (IOException e) {
				System.out.println("[Error] 파일 닫기 실패");
		
			}
		}
		System.out.println(total + "byte");
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
