package java05_control.ifEx;

import java.util.Scanner;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		/*
		 * if(���ǽ�){
		 * 		���ǽ�1�� ���ϰ�� ����
		 * }else if(���ǽ�2){
		 * 		���ǽ�1�� �����϶�
		 * 		���ǽ�2�� ���ϰ�� ����
		 * }else if(���ǽ�3){
		 * 		���ǽ�1�� �����϶�
		 * 		���ǽ�2�� �����϶�
		 * 		���ǽ�3�� ���ϰ�� ����
		 * }else{
		 * 		��� ������ �����϶� ����
		 * }
		 */
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" �� ����Դϴ�");
		}else if(num<0) {
			System.out.println(num+" �� �����Դϴ�");
		}else{
			System.out.println(num+" �� 0�Դϴ�");
		} 
		
	}
}
