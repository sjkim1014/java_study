package java05_control.ifEx;

import java.util.Scanner;

public class IfBasicQuiz_02 {
	public static void main(String[] args) {
		/*
		 * 
			 + ������ �Է� �޾� ���� ū ���� ����Ͻÿ�
			
			 + �μ��� �Է� �޾� ���� ¦���̰�
			  3�� ������� �Ǻ��Ͻÿ�
			
			 + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ�
			  ����� 90�̻��̸� ��A��, 80�̻��̸� ��B��,
			  70 �̻��̸� ��C��, 60 �̻��̸� ��D��,
			  60�̸��̸� ��F���� ����Ͻÿ�.

		 * */
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number1 : ");
		num1 = sc.nextInt();
		System.out.print("input number2 : ");
		num2 = sc.nextInt();
		System.out.print("input number3 : ");
		num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			if(num1==num2 && num2==num3) {
				System.out.println("��簪�� ����");
			}else if(num1==num2){
				System.out.println("num1�� num2�� ����");
			}else if(num1==num3){
				System.out.println("num1�� num3�� ����");
			}else {
				System.out.println("num1�� ���� ū ��");
			}
			
		}else if(num2>=num3) {
			if(num2==num3) {
				System.out.println("num2�� num3�� ����");
			}else {
				System.out.println("num2�� ���� ū��");
			}
		}else {
			System.out.println("num3�� ���� ū��");			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num4,num5,sum;
		System.out.print("input number4 : ");
		num4 = sc.nextInt();
		System.out.print("input number5 : ");
		num5 = sc.nextInt();
		
		sum = num4+num5;
		
		if(sum!=0) {
			if(sum%2==0 && sum%3==0) {
				System.out.println(sum+"�� ���� ¦���̰� 3�� �����");
			}else if(sum%2==0) {
				System.out.println(sum+"�� ���� ¦���̰� 3�� ����� �ƴϴ�");
			}else if(sum%3==0){
				System.out.println(sum+"�� ���� ¦���ƴϰ� 3�� �����");
			}else {
				System.out.println(sum+"�� ���� ¦���� �ƴϰ� 3�� ����� �ƴϴ�");
			}
		}else {
			System.out.println("0 �Դϴ�.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num6,num7,num8,sum2;
		double avg;
		
		System.out.print("input number6 : ");
		num6 = sc.nextInt();
		System.out.print("input number7 : ");
		num7 = sc.nextInt();
		System.out.print("input number8 : ");
		num8 = sc.nextInt();
		
		sum2 = num6+num7+num8;
		avg = (double)sum2/3;
		
		System.out.println("�հ� : "+sum2);
		System.out.printf("%.2f\n",avg);
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
	}
}
