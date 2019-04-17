package java11_api;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		
		System.out.println(ran.nextInt());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble());
		
		System.out.println("--------------");
		
		System.out.println(ran.nextInt(10)); //0~9
		System.out.println(ran.nextInt(10)+1); //1~10
		System.out.println(ran.nextInt(5)); //0~4
		System.out.println(ran.nextInt(5)+11); //11~15
		
		System.out.println("--------------");
		int[] arr = new int[5];
		//1~100 난수를 5개 생성해서 int[]에 순서대로 넣기
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.print(arr[i] + " ");
		}
		
	}
}
