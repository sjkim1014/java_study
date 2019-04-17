package java13_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_10_Wildcard {
	public static void display(List<? extends Integer> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);			
		List<String> list2 = Arrays.asList("A","B","C");
		
		display(list);
//		display(list2);
		//Number의 하위클래스만 타입파라미터로 허용
	
	}
}











