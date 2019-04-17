package java05_control.ifEx;

import java.util.Scanner;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		/*
		 * if(조건식){
		 * 		조건식1이 참일경우 수행
		 * }else if(조건식2){
		 * 		조건식1이 거짓일때
		 * 		조건식2가 참일경우 수행
		 * }else if(조건식3){
		 * 		조건식1이 거짓일때
		 * 		조건식2이 거짓일때
		 * 		조건식3가 참일경우 수행
		 * }else{
		 * 		모든 조건이 거짓일때 수행
		 * }
		 */
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" 은 양수입니다");
		}else if(num<0) {
			System.out.println(num+" 은 음수입니다");
		}else{
			System.out.println(num+" 은 0입니다");
		} 
		
	}
}
