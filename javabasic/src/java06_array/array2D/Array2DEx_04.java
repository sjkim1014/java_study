package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_04 {
	public static void main(String[] args) {
		//가변배열
		
		int[][] arr;
		
		arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[8];
		arr[2] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println("2차원 배열의 길이 : "+arr.length);
		System.out.println("---------------");
		System.out.println("0번째 1차원 배열의 길이 : "+arr[0].length);
		System.out.println("1번째 1차원 배열의 길이 : "+arr[1].length);
		System.out.println("2번째 1차원 배열의 길이 : "+arr[2].length);

		
		
	}
}
