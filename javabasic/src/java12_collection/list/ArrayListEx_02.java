package java12_collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx_02 {
	public static void main(String[] args) {
		
		//<> 는 Generic을 설정하는곳
		// 설정하지 않으면 object타입을 설정한 것과 비슷
		List list1 = new ArrayList();
		
		//String요소만 다룰수있는 ArrayList 생성
		List<String> list2 = new ArrayList<>();
		
		//Integer 요소만 다루는 ArrayList
		List<Integer> list3 = new ArrayList<Integer>();
		
		
		list2.add("Apple");
//		list2.add(123);	//<String>으로 제한되어있음
		
		list3.add(123);
		list3.add((int)12.345); //<Integer>으로 제한됨
		
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println("-------------------");
		List intList = Arrays.asList(1,2,3,4,5);
		// int[] arr ={1,2,3,4,5};
		System.out.println(intList);
		
		List strList = Arrays.asList("Alice", "Bob", "Clare");
		System.out.println(strList);
	}
}
















