package java05_control.ifEx;

import java.util.Scanner;

public class IfElseEx_03 {
	public static void main(String[] args) {
		
		//���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��ϱ�
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		if(num!=0) {
			if(num > 0) {
				System.out.println(num+" �� ����Դϴ�.");
			}else {
				System.out.println(num+" �� �����Դϴ�.");
			}
		}else {
			System.out.println(num+" �� 0�Դϴ�");
		}
		
		
	}
}
