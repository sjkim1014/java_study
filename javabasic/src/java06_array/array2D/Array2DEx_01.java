package java06_array.array2D;

import java.util.Arrays;

public class Array2DEx_01 {
	public static void main(String[] args) {
		//2�����迭
		
		int[][] arr;
		arr = new int[2][3];//2�� 3��¥�� ǥ�� ��������Ͱ� ���
		
		arr[1][2]=555;	//2���� �迭�� ��ҿ� ����
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
