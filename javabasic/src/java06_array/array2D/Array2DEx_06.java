package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_06 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		
		System.out.println("생성 이전 : "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr = new int[3];//이건 int[5] 메모리는 GC가 해제
		//GC : Garbage Collector;
		
		System.out.println("생성 이후 : "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}
