package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz6 {
	public static void main(String[] args) {
		
		int i,j,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {			
			for(j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(i+" ");
			}
		}		
	}
}
