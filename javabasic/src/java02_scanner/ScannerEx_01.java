package java02_scanner;

//scanner 클래스 import
// import 코드 이후로는 Scanner 축약해서 사용가능
import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		// Scanner 타입의 변수 생성
		
		//Scanner 객체
		//키보드의 입력을 받을 수 있도록 해주는 기능
		Scanner sc = new Scanner(System.in);
		
		int num; // 변수선언
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();//사용자의 입력대기
		//키보드의 입력을 받아 해당데이터를 num변수에 대입
		//int 변수이기 때문에 int형값을 입력해야함
		
		//출력
		
		System.out.println("입력한 값 : " + num);	
	
		
		
	}
}
