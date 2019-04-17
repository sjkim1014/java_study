package java12_collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx_04 {
	public static void main(String[] args) {
		List list = new Vector();
		
		list.add("Apple");
		list.add("Banana");
		
		System.out.println("-----------");
		Vector v= new Vector(2,5);
		v.add("사과");
		v.add("포도");
		v.add("딸기");
		v.add("파인애플");
		
		System.out.println("Size : " + v.size());
		System.out.println("Capacity : "+v.capacity());
		
		System.out.println(v);
		
		System.out.println("----------------");
		List ll = new LinkedList();
		ll.add("Apple");
		ll.add("BAnana");
		ll.add("Cherry");
		System.out.println(ll);
		ll.remove("BAnana");
		System.out.println(ll);
	}
}
