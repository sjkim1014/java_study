package java02_scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		// �Է� ��ü Scanner		
		Scanner input = new Scanner(System.in);
		
		//�Է¾ȳ��޽���
		System.out.print("Input Message : ");
		
		String str = input.nextLine();
		
		System.out.println("�Է� ������ : " + str);
		
	}
}
