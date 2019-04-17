package java06_array.array2D;

import java.util.Arrays;

public class Array2DEx_02 {
	public static void main(String[] args) {
		//1차원 배열의 초기화
		int[] arr1D = {1,2,3,4,5};
		int[][] arr2D = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr3D = {{1,1},{1,2},{1,3},{2,1},{2,2},{2,3}};
		
		for(int i=0; i<arr2D.length; i++) {
			for(int j=0; j<arr2D[i].length; j++) {
				arr2D[i][j]=(i+1)*10+(j+1);
			}			
		}System.out.println();
		
		for(int i=0; i<arr2D.length; i++) {
			for(int j=0; j<arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
