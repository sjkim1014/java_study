package java06_array.etc;

import java.util.Arrays;

public class ArrayEtcEx_01 {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		System.out.println(arr);
		
		String str = "Apple";
		System.out.println(str);
		//System.out.println은 참조형 변수의 참조값을 출력하는것이 기본
		//문자열 만큼은 사용자편의를 위해 내용물(문자열)을 
		//출력하도록 되어있다.
		//-> toString() 메소드를 이용한다
		
		System.out.println(Arrays.toString(arr));
		//Array.toString(배열변수)
		//배열의 내용물을 문자열로 변경해주는 API
	}
}
