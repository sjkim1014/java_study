package java05_control.ifEx;

import java.util.Scanner;

public class IfElseEx_03 {
	public static void main(String[] args) {
		
		//숫자 하나를 입력받아 양수인지 음수인지 판별하기
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		if(num!=0) {
			if(num > 0) {
				System.out.println(num+" 은 양수입니다.");
			}else {
				System.out.println(num+" 은 음수입니다.");
			}
		}else {
			System.out.println(num+" 은 0입니다");
		}
		
		
	}
}
