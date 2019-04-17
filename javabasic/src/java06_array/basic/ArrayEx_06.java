package java06_array.basic;

import java.util.Scanner;

public class ArrayEx_06 {
	public static void main(String[] args) {
		
		String str = "Allice";
		
		String[] strArr;
		
		strArr = new String[3];
		
		strArr[0]="Apple";
		strArr[1]="Banana";
		strArr[2]="Cherry";
		
		System.out.println(strArr[0].length());
		System.out.println(strArr[1].length());
		System.out.println(strArr[2].length());
		
		for(int i=0; i<3; i++) {
			System.out.println("------");
			System.out.println(i+"번째요소 : "+strArr[i]);
			System.out.println("길이  : "+strArr[i].length());
		}		
	
	}
}
