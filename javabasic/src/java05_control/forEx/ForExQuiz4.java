package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz4 {
	public static void main(String[] args) {
		
		int num,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
