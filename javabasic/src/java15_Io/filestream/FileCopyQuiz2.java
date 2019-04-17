package java15_Io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//+ 파일 복사2, File Copy2
//- Lower.txt 파일을 Upper.txt로 복사한다
//
//- Lower.txt에서 읽은 문자가 소문자라면 대문자로 변환한다 
public class FileCopyQuiz2 {
	public static void main(String[] args) {
		File file = new File("./src/java15_Io/filestream","Lower.txt");
		File file2 = new File("./src/java15_Io/filestream","Upper.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1];	//임시저장소
		int len=-1;		
		int total=0;	//복사된총길이
		String str;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			while((len=fis.read(buf))!= -1) {	
				if('A'<=buf[0] && buf[0]<='Z') {
					str=new String(buf,0,len);					
					buf = str.toLowerCase().getBytes();					
				}else if('a'<=buf[0] && buf[0]<='z') {
					str=new String(buf,0,len);					
					buf = str.toUpperCase().getBytes();					
				}
				
				fos.write(buf, 0, len);
				
				System.out.println("-----------");
				System.out.println("읽은바이트의수 " + len);
				
				
				total+=len;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[Error] 입력 파일 없음");
			System.out.println("[Error] 출력파일을 지정할수없음");
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
		System.out.println("복사한 총 바이트수 "+total + "byte");
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
