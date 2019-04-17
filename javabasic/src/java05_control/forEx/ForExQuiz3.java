package java05_control.forEx;

import java.util.Scanner;

public class ForExQuiz3 {
	public static void main(String[] args) {
		
		int i,num1,num2,temp=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input num1 : ");
		num1 = sc.nextInt();
		System.out.print("input num2 : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;			
		}			
		
		
		for(i=num2; true; i++) {
			if(i%num1==0 && i%num2==0) {				
				temp = i;	
				break;
			}			
		}
		System.out.println("최소공배수는 " +temp);
				
		
	}
}
