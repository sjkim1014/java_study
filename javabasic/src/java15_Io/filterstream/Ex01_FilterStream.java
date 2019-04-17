package java15_Io.filterstream;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class Ex01_FilterStream {
	public static void main(String[] args) {
		FilterInputStream fis; 	//필터입력스트림 객체 선언
		
		// protected 접근제한자가 부여된 생성자를 가지고 있어 객체 생성 불가
//		fis = new FilterInputStream(System.in);
		
		FilterOutputStream fos;	//필터출력스트림 객체 선언
		
		// FilterOutputStream 객체를 직접 사용하진 않음
		// 서브클래스들을 활용함
		fos = new FilterOutputStream(System.out);
	}
}
