package java06_array.basic;

import java.util.Scanner;

public class ArrayEx_04 {
	public static void main(String[] args) {
		
		//문자 배열, char Array
		
		char[] chArr = {'A','p','p','l','e'};
		
		for(int i=0; i<chArr.length; i++) {
			System.out.print(chArr[i]);
			
		}

		String str = "Apple";
		
		//문자열의 요소 활용하기
		System.out.println(str.charAt(3));
		
		//문자열의 길이
		 System.out.println(str.length());
		 
		 char[] result = str.toCharArray();
		 System.out.println("char[]의 길이 : "+result.length);
		 
		 System.out.println("------------");
		 
		 Scanner sc = new Scanner(System.in);
		 char ch = sc.nextLine().charAt(0);
		 
		 System.out.println(ch);
		
	
	}
}
