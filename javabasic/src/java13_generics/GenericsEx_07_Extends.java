package java13_generics;

import java08_inheritance.product.Tv;

public class GenericsEx_07_Extends {
	public static void main(String[] args) {
		
		print(10);		//int
		print(123.345);	//double
//		print("Apple");	//String		Number의 자식클래스가 아니라서 오류남		
		
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	}
}













