package java06_array.etc;

import java.util.Arrays;

public class ArrayEtcEx_02 {
	public static void main(String[] args) {
		//����, Sorting
		
		int[] arr= {4,9,5,1,3};
		System.out.println("----������----");
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("----������----");
		System.out.println(Arrays.toString(arr));
	}
}
