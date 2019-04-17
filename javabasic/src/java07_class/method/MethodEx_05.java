package java07_class.method;

import java.util.Scanner;

public class MethodEx_05 {
	public static void main(String[] args) {
		Method_05 m05=new Method_05();
		int num=510;
		System.out.println(num);
		m05.test01(num);
		System.out.println(num);
		System.out.println("-----");
		int[] arr = new int[5];
		arr[1]=200;
		System.out.println(arr[1]);
		m05.test02(arr);
		System.out.println(arr[1]);
		
		System.out.println("-----");
		num=m05.test03();
		System.out.println(num);
		System.out.println("-----");
		
		int[] ar = m05.test04();
		System.out.println(ar);
	}
}
