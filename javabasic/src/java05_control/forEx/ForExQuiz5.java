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
		System.out.println("1���� 1000������ 4�� ����� "
				+ "\n6���� ����� �������� 1�� ���� ���� : "+sum);
		
	}
}
