package java06_array.array2D;

import java.util.Arrays;

public class Array2DEx_01 {
	public static void main(String[] args) {
		//2차원배열
		
		int[][] arr;
		arr = new int[2][3];//2행 3열짜리 표가 만들어진것과 비슷
		
		arr[1][2]=555;	//2차원 배열의 요소에 대입
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
