package java06_array.etc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEtcEx_04_BubbleSort {
	public static void main(String[] args) {
		int[] arr= {3,2,5,4,1};
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
				
		
	}
}
