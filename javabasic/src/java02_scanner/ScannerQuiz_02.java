package java02_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		
		/*
		 * 1. �������Է�
		 * 1-1 ���������
		 * �̸� ���� ���� ���� ���� ���� 
		 * ������ ��Ʈ������ ó��
		 * 
		 * 1-2 ������ �Է¹ޱ�
		 * 2. ������ ��� ����ϱ�
		 * sum�� avg������ ���弼��
		 * 
		 * 3.�л� ���� ���
		 * 
		 * �̸� ���� ���� ���� ���� ���� ���� ���
		 * alice 22 �� 100 80 56 236 78.67
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		String name,sex;
		int age,ko,ma,eng,sum;
		double avg;
		
		System.out.println("----�Է�----");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("���� : ");
		sc.nextLine();
		sex = sc.nextLine();
		
		System.out.print("���� : ");
		ko = sc.nextInt();
		
		System.out.print("���� : ");
		eng = sc.nextInt();
		
		System.out.print("���� : ");
		ma = sc.nextInt();
		
		sum = ko+eng+ma;
		avg = (double)sum/3;
		
		System.out.println("\n\n---���---");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		System.out.printf("%s\t%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",name,age,sex,ko,ma,eng,sum,avg);
		System.out.println(name + "\t" + age + "\t" + sex + "\t" + ko + "\t" + ma + "\t" + eng + "\t" + sum +"\t" + avg );
		
			
	}
}
