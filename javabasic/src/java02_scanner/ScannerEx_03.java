package java02_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�޽��� �Է� : ");
		String msg = input.nextLine();
		
		System.out.print("���� �Է� : ");
		int num = input.nextInt();
		
		System.out.println("�޽��� : " + msg + " , ���� : " + num);
		
	}
}
