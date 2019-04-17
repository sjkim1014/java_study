package java05_control.ifEx;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		//숫자 하나를 입력받아 양수인지 음수인지 판별하시오
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자하나를 입력하세요 : ");
		num = sc.nextInt();
		System.out.println();
		
		if(num>0) {
			System.out.println("input number : "+num);
			System.out.println("양수입니다.");
			System.out.println();
		}
		if(num<0) {
			System.out.println("input number : "+num);
			System.out.println("음수입니다.");
			System.out.println();
		}
		if(num==0) {
			System.out.println("input number : "+num);
			System.out.println("0입니다.");
			System.out.println();
		}
		
		
		if(num!=0) {
			if(num%3==0) {
				System.out.println("input number : "+num);
				System.out.println("3의 배수입니다.");
				System.out.println();
			}
			if(num%3!=0) {
				System.out.println("input number : "+num);
				System.out.println("3의 배수가 아닙니다.");
				System.out.println();
			}
		}
		if(num==0) {
			System.out.println("0은 3의 배수가 아닙니다");
		}
		
		int num1,num2;
		
		System.out.print("num1을 입력하세요 : ");
		num1 = sc.nextInt();
		
		System.out.print("num2을 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println();
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

		if(num1>num2) {
			System.out.println(num1+" 이 더 큰 수");
		}
		if(num1<num2) {
			System.out.println(num2+" 이 더 큰 수");
		}
		if(num1==num2) {
			System.out.println("같다");
		}
		
		
		
		
	}
}
