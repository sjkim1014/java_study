package java02_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//Ű���� �Է°�ü, Scanner ����
		Scanner input = new Scanner(System.in);
		
		//���ڿ� �Է�
		//next() �� nextLine()
		String str1;	//�Է� ���ڿ� ����
		String str2;	//�Է� ���ڿ� ����
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str1 = input.nextLine(); //���ڿ��Է¹ޱ�
		str2 = input.next(); //���ڿ��Է¹ޱ�
		
		//next() : ���鹮�ڱ��� �ϳ��� ���ڿ��� �ν�
		//nextLine() : ���Ͱ������� �װ����� ����
		
		System.out.println("---���---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		
		
		
		
	}
}
