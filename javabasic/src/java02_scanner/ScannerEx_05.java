package java02_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//�Է°�ü
		
		//int �� �Է�		
		//String �� �Է�		
		//���
		
		int num;
		String str;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();	
		
		System.out.print("���� �Է� : ");
		
		//���ۺ���
		sc.nextLine(); // ������ �ٹٲ޹��ڸ� �����ͼ� ������
		str = sc.nextLine();
		
		System.out.println("---���---");				
		System.out.println("���� : " + num);				
		System.out.println("���ڿ� : " + str);				
		
	}
}
