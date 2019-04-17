package java12_collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx_01 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(11);
		set.add(22);
		set.add(33);
		
		System.out.println(set);
		
		System.out.println("--------------");
		System.out.println("ũ�� : "+set.size());
		System.out.println("����°�? "+set.isEmpty());
		System.out.println("22�� �ִ°�? "+set.contains(22));
		System.out.println("33���� : "+set.remove(33));
		System.out.println("55���� : "+set.remove(55));
		System.out.println(set);
		
		System.out.println("--------------");
		set.clear();
		System.out.println("����°�? "+set.isEmpty());
		System.out.println(set);
	}
}
