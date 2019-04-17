package java02_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//키보드 입력객체, Scanner 생성
		Scanner input = new Scanner(System.in);
		
		//문자열 입력
		//next() 와 nextLine()
		String str1;	//입력 문자열 변수
		String str2;	//입력 문자열 변수
		
		System.out.print("문자열을 입력하세요 : ");
		str1 = input.nextLine(); //문자열입력받기
		str2 = input.next(); //문자열입력받기
		
		//next() : 공백문자까지 하나의 문자열로 인식
		//nextLine() : 엔터가있을때 그것으로 나눔
		
		System.out.println("---출력---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		
		
		
		
	}
}
