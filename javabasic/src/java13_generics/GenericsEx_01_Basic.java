package java13_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList<>();
//		list1.add(data); //data를 받아야 하기 때문에 
						//제네릭 E를 Object로 임시 결정한다
		
		List<String> list2 = new ArrayList<>();
		//list2.add(data); // data는 String타입이어야만 한다
							// => 타입안정성
		
		List<Integer> list3 = new ArrayList<>();
		//list3.add(data); // data는 Integer타입이어야만 함
							//	=> 타입안정성		
		list2.add("AA");
//		list2.add(123);//타입안정성
		
//		list3.add("BB");//타입안정성
		list3.add(456);	
		
		list1.add("CCC");
		list1.add(123123);
		list1.add(true);
		
		//불필요한 형변환 발생
		String str = (String)list1.get(0);
		//타입안정성 제공되지 않음
		Integer num = (Integer)list1.get(2);
		Boolean b = (Boolean)list1.get(1);		//실행시키면 오류
		
		System.out.println(str);
		System.out.println(num);
		System.out.println(b);

		
		
	}
}
