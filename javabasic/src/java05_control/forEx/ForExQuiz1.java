package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz1 {
	public static void main(String[] args) {
		
		int i,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input >> ");
		num = sc.nextInt();
		
		for(i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}
}
