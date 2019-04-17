package java12_collection.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx_03 {
	public static void main(String[] args) {
		//반복자, iterator
		// 컬렉션의 요소들을 순차적으로 읽어오는 방법을 표준화 시킨것
		
		List list = Arrays.asList("A","B","C","D","E");
		
		Iterator iter; //반복자 선언(interface Interator)
		
		iter = list.iterator();
		
		while(iter.hasNext()) {		//다음값이 있는지 확인
			System.out.println(iter.next());	//next 값을 리턴해줌
		}
	}
}
