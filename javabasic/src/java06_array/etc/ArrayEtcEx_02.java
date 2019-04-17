package java06_array.etc;

import java.util.Arrays;

public class ArrayEtcEx_02 {
	public static void main(String[] args) {
		//정렬, Sorting
		
		int[] arr= {4,9,5,1,3};
		System.out.println("----정렬전----");
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
		System.out.println("----정렬후----");
		System.out.println(Arrays.toString(arr));
	}
}
