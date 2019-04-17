package java12_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx_01 {
	public static void main(String[] args) {
		List list;
		
		list = new ArrayList();
		
		//CRUD : 프로그램이 데이터를 처리하는 기본적인 동작
		// Create : 생성, 삽입
		// Read : 조회
		// Update : 수정
		// Delete : 삭제
		
		System.out.println("---삽입---");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");		
		System.out.println(list);
		
		System.out.println("\n---삭제(2)---");
		list.remove(2);
		System.out.println(list);
		
		System.out.println("\n---조회(1)---");		
		System.out.println(list.get(1));
		
		System.out.println("\n---삽입---");
		list.add(1,"Tomato");	
		System.out.println(list);
		
		System.out.println("\n---contains---");	
		System.out.println(list.contains("Tomato"));
		System.out.println(list.contains(new String("Tomato")));
		
		System.out.println("\n---isEmpty---");
		System.out.println(list.isEmpty());
		
		if(!list.isEmpty()) {
			//비어있지 않을때 동작
			System.out.println(list.get(0));
		}
		
		System.out.println("\n----clear----");	//list를 비우는것 엘리먼트를 다지움
		list.clear();
		System.out.println(list);
		
		System.out.println("\n-----------------------");
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n----------------------");
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("\n----------------------");
		list.add(100);
		list.add(true);
		list.add(100.123);		
		System.out.println(list);
		
		
		
		
	}
}
















