package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_04 {
	public static void main(String[] args) {
		//�����迭
		
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
		System.out.println("2���� �迭�� ���� : "+arr.length);
		System.out.println("---------------");
		System.out.println("0��° 1���� �迭�� ���� : "+arr[0].length);
		System.out.println("1��° 1���� �迭�� ���� : "+arr[1].length);
		System.out.println("2��° 1���� �迭�� ���� : "+arr[2].length);

		
		
	}
}
