package java05_control.switchEx;

import java.util.Scanner;

public class SwitchExQuiz {
	public static void main(String[] args) {
		
		/*
		 * - �޴������
		 * 
		 * =====================
		 * M e n u
		 * =====================
		 * 1.Hello World ���
		 * 2.�̸����
		 * 3.�������
		 * 4.����
		 * 
		 * 
		 * */
		
		final int HELLO = 1;
		final int NAME = 2;
		final int SEX = 3;
		final int EXIT = 4;
		
		int i;
		String name="���ν�",sex="��";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============");
		System.out.println("M E N U");
		System.out.println("==============");
		System.out.println("1.Hello World ���");
		System.out.println("2.�̸����");
		System.out.println("3.�������");
		System.out.println("4.����");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print(">> : ");
		i = sc.nextInt();
		
		switch(i) {
		case HELLO:
			System.out.println("Hello World");
			break;
		case NAME:
			System.out.println(name);
			break;
		case SEX:
			System.out.println(sex);
			break;
		case EXIT:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
		
	}
}
