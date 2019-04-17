package java12_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx_01 {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println(map);
		System.out.println("-----");
		System.out.println(map.get(2));
		
		System.out.println("-----");
		map.put("D","Durian");
		System.out.println(map);
		System.out.println(map.get("D"));
		
		System.out.println("-----");
		map.put(2,"Orange");	//키 중복X, 같은 키의 값을 덮어씀
		map.put(4,"Apple");		//값 중복O, 새로운 Entry로 삽입
		
		System.out.println(map);
		
		System.out.println("-----");
		System.out.println(map.containsKey(5));	// containsKey : 키값이 있는지없는지 판별
		System.out.println(map.containsValue("Apple"));	// containsValue : 값이 있는지 없는지 판별
		
		System.out.println("-----");
		if(!map.containsKey(5)) {		//5번째 키값이 있는지없는지 판별후
			map.put(5, "Pineapple");	//없으면 5번째에 파인애플 삽입
		}
		if(map.containsKey("55")) {
			String str = (String)map.get("55");
			System.out.println(str.length());
		}		
		
		System.out.println("-----");
		System.out.println("size : "+map.size());
		
		System.out.println("-----");
		System.out.println("비었는가? : " + map.isEmpty());
		
		System.out.println("-----");
		map.remove(3);	//키를지정하여삭제
		System.out.println(map);
	
		map.remove(2, "Apple");	//키를 지정하고 값을 확인하고 삭제
		System.out.println(map);
		
		System.out.println("-----");
		map.put(10, null);
		map.put(null,"Bob");
		System.out.println(map);
		System.out.println(map.get(null));
		
		map.put(null, null);
		System.out.println(map);
		
		//null을 키 또는 값에 적용할 수 있음
		//키로 null을 설정하는 건 좋지않음
		
		System.out.println("\n---map -> set---");
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		System.out.println("key : "+ keySet);
		System.out.println("entry : "+ entrySet);
		
		System.out.println("-----");
		System.out.println("\n---iterate---");
		
		Set keys = map.keySet();
		Iterator keysIter = keys.iterator();
		while(keysIter.hasNext()) {
			System.out.println(map.get(keysIter.next())); // 밸류꺼냄
		}
		
		
	}
}















