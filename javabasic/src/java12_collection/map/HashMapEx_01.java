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
		map.put(2,"Orange");	//Ű �ߺ�X, ���� Ű�� ���� ���
		map.put(4,"Apple");		//�� �ߺ�O, ���ο� Entry�� ����
		
		System.out.println(map);
		
		System.out.println("-----");
		System.out.println(map.containsKey(5));	// containsKey : Ű���� �ִ��������� �Ǻ�
		System.out.println(map.containsValue("Apple"));	// containsValue : ���� �ִ��� ������ �Ǻ�
		
		System.out.println("-----");
		if(!map.containsKey(5)) {		//5��° Ű���� �ִ��������� �Ǻ���
			map.put(5, "Pineapple");	//������ 5��°�� ���ξ��� ����
		}
		if(map.containsKey("55")) {
			String str = (String)map.get("55");
			System.out.println(str.length());
		}		
		
		System.out.println("-----");
		System.out.println("size : "+map.size());
		
		System.out.println("-----");
		System.out.println("����°�? : " + map.isEmpty());
		
		System.out.println("-----");
		map.remove(3);	//Ű�������Ͽ�����
		System.out.println(map);
	
		map.remove(2, "Apple");	//Ű�� �����ϰ� ���� Ȯ���ϰ� ����
		System.out.println(map);
		
		System.out.println("-----");
		map.put(10, null);
		map.put(null,"Bob");
		System.out.println(map);
		System.out.println(map.get(null));
		
		map.put(null, null);
		System.out.println(map);
		
		//null�� Ű �Ǵ� ���� ������ �� ����
		//Ű�� null�� �����ϴ� �� ��������
		
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
			System.out.println(map.get(keysIter.next())); // �������
		}
		
		
	}
}















