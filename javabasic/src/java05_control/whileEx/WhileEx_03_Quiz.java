package java05_control.whileEx;

import java.util.Scanner;

public class WhileEx_03_Quiz {
	public static void main(String[] args) {
		//숫자하나를 입력받고
		//1부터 입력한숫자까지
		//모든숫자를 더해서 출력하기
		//(while 이용)
		
		int i,num,sum=0;		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num=sc.nextInt();
		
		i=1;
		while(i<=num) {
			sum+=i;
			i++;
		}
		
		System.out.println("결과 : "+sum);		
	}
}
