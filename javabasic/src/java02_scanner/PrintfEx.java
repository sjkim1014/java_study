package java02_scanner;

import java.util.Scanner;

public class PrintfEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%s : %d", "숫자", 123);
		
		System.out.println();
		System.out.printf("%10s : %10d \n", "숫자", 123);
		
		System.out.println();
		double d = 123.456;
		System.out.printf("%10.2f : %10.5f \n", 123123.123123, d);
		
		System.out.printf("100%%\n");
		System.out.println("112345\\");	
		System.out.println("\"오민식\"");	
		
		System.out.println("1 1");
		System.out.println("1     1");
		
	}
}
