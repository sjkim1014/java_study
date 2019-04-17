package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz2 {
	public static void main(String[] args) {
		
		int i,num1,num2,temp=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input num1 : ");
		num1 = sc.nextInt();
		System.out.print("input num2 : ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;			
		}			
		
		
		for(i=1; i<num2; i++) {
			if(num1%i==0 && num2%i==0) {				
				temp = i;				
			}						
		}
		System.out.println("최대공약수는 " +temp);		
	}
}
