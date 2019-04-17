package java02_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("메시지 입력 : ");
		String msg = input.nextLine();
		
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		
		System.out.println("메시이 : " + msg + " , 숫자 : " + num);
		
	}
}
