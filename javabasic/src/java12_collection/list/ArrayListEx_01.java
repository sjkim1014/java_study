package java12_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx_01 {
	public static void main(String[] args) {
		List list;
		
		list = new ArrayList();
		
		//CRUD : ���α׷��� �����͸� ó���ϴ� �⺻���� ����
		// Create : ����, ����
		// Read : ��ȸ
		// Update : ����
		// Delete : ����
		
		System.out.println("---����---");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");		
		System.out.println(list);
		
		System.out.println("\n---����(2)---");
		list.remove(2);
		System.out.println(list);
		
		System.out.println("\n---��ȸ(1)---");		
		System.out.println(list.get(1));
		
		System.out.println("\n---����---");
		list.add(1,"Tomato");	
		System.out.println(list);
		
		System.out.println("\n---contains---");	
		System.out.println(list.contains("Tomato"));
		System.out.println(list.contains(new String("Tomato")));
		
		System.out.println("\n---isEmpty---");
		System.out.println(list.isEmpty());
		
		if(!list.isEmpty()) {
			//������� ������ ����
			System.out.println(list.get(0));
		}
		
		System.out.println("\n----clear----");	//list�� ���°� ������Ʈ�� ������
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
















