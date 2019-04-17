package java06_array.copy;

import java.util.Scanner;

public class ArrayCopyEx_01 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//얕은복사(shallow copy)
		//참조형 변수의 참조값만 복사된 경우
		//원본과 복사본 변수는 같은 참조값을 가진다
		
		arr2 = arr1;
		System.out.println("수정전");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		arr1[1]=999;
		
		System.out.println("수정후");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
	
	}
}
