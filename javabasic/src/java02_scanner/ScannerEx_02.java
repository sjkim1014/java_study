package java02_scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		// 입력 객체 Scanner		
		Scanner input = new Scanner(System.in);
		
		//입력안내메시지
		System.out.print("Input Message : ");
		
		String str = input.nextLine();
		
		System.out.println("입력 데이터 : " + str);
		
	}
}
