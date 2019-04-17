package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_05 {
	public static void main(String[] args) {
		//new : 동적할당 연산자
		
		// ** 할당 : 메모리 공간 생성
		// ** 동적<->정적
		//동적 : 동작중, Run-time
		//정적 : 실행전, Compile-time
		
		//정적 할당
		int num; //int형 변수 선언 -> 정적으로 할당받음
		//동적할당
		int[] arr; //int형 배열 변수 선언 -> 정적할당
		arr=new int[5]; //int[5] 생성 -> 동적할당
		
		//선언과 동시에 초기화
		int[] a=new int[5];
		//선언과 생성이 한꺼번에 작성되었지만
		//정적할당(변수선언), 동적할당(배열생성)
		//수행시점이 다르다
		
		int[][] ar = new int[3][];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ar.length; i++) {
			System.out.println(i+"행 배열의 크기는? ");
			int len=sc.nextInt();
			ar[i]=new int[len];
		}
		
		
		
	}
}
