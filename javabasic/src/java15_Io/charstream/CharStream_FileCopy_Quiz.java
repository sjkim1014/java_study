package java15_Io.charstream;
//+ 문자스트림 이용 FileCopy
//
//- Source.txt 파일을 Dest.txt 파일로 복사한다
// ( Source.txt의 크기 = 4250 Bytes )
//
//- BufferedReader 와 BufferedWriter 를 이용
//
//- 문자단위로 하나씩 복사하게 된다
// ( BufferedReader.read(char[]) 메소드를 이용하면
//  길이는 총 바이트가 아닌 총 문자수가 나온다)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//1. 입출력 대상
//- File Src, Dest; //원본과 복사본
//
//2. 입출력 스트림 선언
//- BufferedReader br;
//- BufferedWriter bw;
//
//3. 입출력 처리 (try-catch 구문)
//3-1. 입출력 스트림 생성
//  - FileReader를 이용하여 BufferedReader 생성
//  - FileWriter를 이용하여 BufferedWriter 생성
//
//3-2. 입출력 (while 구문)
//  - read 로 읽어들여서 write로 출력
//  - 복사한 문자 수 연산 (total)
//
//3-3. 예외 처리 및 close
//
//4. 복사한 문자 수 출력
public class CharStream_FileCopy_Quiz {
	public static final String PATH = "./src/java15_Io/charstream";
	public static final String SRC ="Source.txt";
	public static final String DEST ="Desc.txt";
	public static void main(String[] args) {

		File file = new File(PATH,SRC);
		File file1 = new File(PATH,DEST);
		BufferedReader bis = null;
		BufferedWriter bos = null;
		char[] cbuf = new char[1024];
		String str = null;
		int len = -1;
		int total=0;
	
		try {			
			bis = new BufferedReader(new FileReader(file));
			bos = new BufferedWriter(new FileWriter(file1,false));
			
//			while((len=bis.read(cbuf))!=-1){				
//				bos.write(cbuf, 0, len);				
//				total+=len;				
//			}	
			while((str=bis.readLine())!=null){				
				bos.write(str);
				bos.newLine();
				total+=str.length();			
			}	
			bos.flush();
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
				if(bos!=null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//12. 복사한 바이트 수 출력
		System.out.println(total);
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
		
	}
}
