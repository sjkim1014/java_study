package java05_control.ifEx;

import java.util.Scanner;

public class IfBasicQuiz_02 {
	public static void main(String[] args) {
		/*
		 * 
			 + 세수를 입력 받아 가장 큰 수를 출력하시오
			
			 + 두수를 입력 받아 합이 짝수이고
			  3의 배수인지 판별하시오
			
			 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
			  평균이 90이상이면 “A”, 80이상이면 “B”,
			  70 이상이면 “C”, 60 이상이면 “D”,
			  60미만이면 “F”를 출력하시오.

		 * */
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number1 : ");
		num1 = sc.nextInt();
		System.out.print("input number2 : ");
		num2 = sc.nextInt();
		System.out.print("input number3 : ");
		num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			if(num1==num2 && num2==num3) {
				System.out.println("모든값이 같다");
			}else if(num1==num2){
				System.out.println("num1과 num2가 같다");
			}else if(num1==num3){
				System.out.println("num1과 num3가 같다");
			}else {
				System.out.println("num1이 가장 큰 수");
			}
			
		}else if(num2>=num3) {
			if(num2==num3) {
				System.out.println("num2와 num3이 같다");
			}else {
				System.out.println("num2가 가장 큰수");
			}
		}else {
			System.out.println("num3이 가장 큰수");			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num4,num5,sum;
		System.out.print("input number4 : ");
		num4 = sc.nextInt();
		System.out.print("input number5 : ");
		num5 = sc.nextInt();
		
		sum = num4+num5;
		
		if(sum!=0) {
			if(sum%2==0 && sum%3==0) {
				System.out.println(sum+"은 합이 짝수이고 3의 배수다");
			}else if(sum%2==0) {
				System.out.println(sum+"은 합이 짝수이고 3의 배수가 아니다");
			}else if(sum%3==0){
				System.out.println(sum+"은 합이 짝수아니고 3의 배수다");
			}else {
				System.out.println(sum+"은 합이 짝수가 아니고 3의 배수가 아니다");
			}
		}else {
			System.out.println("0 입니다.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num6,num7,num8,sum2;
		double avg;
		
		System.out.print("input number6 : ");
		num6 = sc.nextInt();
		System.out.print("input number7 : ");
		num7 = sc.nextInt();
		System.out.print("input number8 : ");
		num8 = sc.nextInt();
		
		sum2 = num6+num7+num8;
		avg = (double)sum2/3;
		
		System.out.println("합계 : "+sum2);
		System.out.printf("%.2f\n",avg);
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
	}
}
