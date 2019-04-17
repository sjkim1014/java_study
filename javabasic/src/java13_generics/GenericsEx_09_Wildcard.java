package java13_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_09_Wildcard {
	public static void display(List<?> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);		
		display(list);
		
		List<String> list2 = Arrays.asList("A","B","C");		
		display(list2);
		//-----------------------
		
		Object o = null;
		Integer i = null;
		o = i;
		
		//Object는 Integer의 부모클래스
		//자식클래스타입은 부모클래스타입으로 자동형변환
		
		//부모클래스 변수에 자식클래스 변수 대입 가능
		
		//부모타입이 자식타입을 품는다
		//---------------------
		
		List<Object> oList=null;
		List<Integer> iList = null;
//		oList = iList;	// 타입파라미터는 상속관계에 영향받지않는다
	}
}











