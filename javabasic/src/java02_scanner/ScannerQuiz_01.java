package java02_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * �ﰢ������ ���ϱ�
		 * -�ﰢ�� ������ = (�غ� * ����)/2
		 * -�غ��� ���̸� �Է¹޾� ���
		 * 
		 * -ex)
		 * ---�Է� ----
		 * �غ�? 9
		 * ����? 3
		 * 
		 * ---���---
		 * ���� : XX.XX
		 * 
		 * + �߰����� : �Ҽ��� ��°�ڸ����� ���
		 * */
		
		double height,width,sum;
		
		System.out.println("---�Է�---");
		System.out.print("�غ� : ");
		width = sc.nextDouble();
		System.out.print("���� : ");
		sc.nextLine();
		height = sc.nextDouble();
		
		System.out.println("---���---");
		sum = (height * width)/2;
		System.out.println(String.format("���� : %,.2f", sum));
		System.out.printf("���� : %.2f\n", sum);
		
		
		
		
	}
}
