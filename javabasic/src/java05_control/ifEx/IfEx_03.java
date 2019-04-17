package java05_control.ifEx;

import java.util.Scanner;

public class IfEx_03 {
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);	//입력객체
		
		System.out.print("input number :");
		num = sc.nextInt();
		
		if(num!=10) {
			System.out.println("10이 아닙니다");
		}
		if(num==10) {
			System.out.println("10입니다.");
		}
		if((num>=1)&&(num<=100)) {
			System.out.println("1~100사이의 정수입니다.");
		}		
	}
}
