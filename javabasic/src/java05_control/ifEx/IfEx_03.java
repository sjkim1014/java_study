package java05_control.ifEx;

import java.util.Scanner;

public class IfEx_03 {
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);	//�Է°�ü
		
		System.out.print("input number :");
		num = sc.nextInt();
		
		if(num!=10) {
			System.out.println("10�� �ƴմϴ�");
		}
		if(num==10) {
			System.out.println("10�Դϴ�.");
		}
		if((num>=1)&&(num<=100)) {
			System.out.println("1~100������ �����Դϴ�.");
		}		
	}
}
