package java06_array.basic;

import java.util.Scanner;

public class ArrayEx_05 {
	public static void main(String[] args) {
		
		String str="Apple";
		System.out.println(str);
		
		int[] arr= {1,2,3,4,5};
		
		System.out.println(arr);	//참조값출력
		
		System.out.println("---------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		
		arr=new int[3];
		System.out.println(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	
	}
}
