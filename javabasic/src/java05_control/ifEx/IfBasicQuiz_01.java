package java05_control.ifEx;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		//���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����ϳ��� �Է��ϼ��� : ");
		num = sc.nextInt();
		System.out.println();
		
		if(num>0) {
			System.out.println("input number : "+num);
			System.out.println("����Դϴ�.");
			System.out.println();
		}
		if(num<0) {
			System.out.println("input number : "+num);
			System.out.println("�����Դϴ�.");
			System.out.println();
		}
		if(num==0) {
			System.out.println("input number : "+num);
			System.out.println("0�Դϴ�.");
			System.out.println();
		}
		
		
		if(num!=0) {
			if(num%3==0) {
				System.out.println("input number : "+num);
				System.out.println("3�� ����Դϴ�.");
				System.out.println();
			}
			if(num%3!=0) {
				System.out.println("input number : "+num);
				System.out.println("3�� ����� �ƴմϴ�.");
				System.out.println();
			}
		}
		if(num==0) {
			System.out.println("0�� 3�� ����� �ƴմϴ�");
		}
		
		int num1,num2;
		
		System.out.print("num1�� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		
		System.out.print("num2�� �Է��ϼ��� : ");
		num2 = sc.nextInt();
		System.out.println();
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

		if(num1>num2) {
			System.out.println(num1+" �� �� ū ��");
		}
		if(num1<num2) {
			System.out.println(num2+" �� �� ū ��");
		}
		if(num1==num2) {
			System.out.println("����");
		}
		
		
		
		
	}
}
