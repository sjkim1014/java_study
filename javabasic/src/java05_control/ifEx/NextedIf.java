package java05_control.ifEx;

import java.util.Scanner;

public class NextedIf {
	public static void main(String[] args) {
		int num=28;
		
		if(num>=1) {
			if(num<=100) {
				System.out.println("1~100 사이의 정수");
			}
		}
		if(num>=1 && num<=100) {
			System.out.println("1~100 사이의 정수");
		}
		
	}
}
