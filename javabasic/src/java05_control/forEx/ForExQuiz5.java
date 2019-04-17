package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz5 {
	public static void main(String[] args) {
		
		int sum=0,i;
		
		for(i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}
		System.out.println("1부터 1000까지의 4로 나누어도 "
				+ "\n6으로 나누어도 나머지가 1인 수의 합은 : "+sum);
		
	}
}
