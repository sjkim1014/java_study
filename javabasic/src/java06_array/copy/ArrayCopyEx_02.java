package java06_array.copy;

import java.util.Scanner;

public class ArrayCopyEx_02 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//깊은복사 (deep copy)
		//참조 대상의 내용물(저장공간)을 새로운 공간에 복사	
		
		//1. 복사 변수(destination)에 공간확보
		//new 를 이용하여 새로운 공간을 할당한다
		
		arr2 = new int[arr1.length];
		
		//2. for문을 이용하여 내용물(모든요소)를 복사
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		
		
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
