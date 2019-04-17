package java02_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력객체
		
		//int 형 입력		
		//String 형 입력		
		//출력
		
		int num;
		String str;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();	
		
		System.out.print("문자 입력 : ");
		
		//버퍼비우기
		sc.nextLine(); // 버퍼의 줄바꿈문자를 가져와서 버리기
		str = sc.nextLine();
		
		System.out.println("---출력---");				
		System.out.println("숫자 : " + num);				
		System.out.println("문자열 : " + str);				
		
	}
}
