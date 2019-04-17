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
		System.out.println("크기 : "+set.size());
		System.out.println("비었는가? "+set.isEmpty());
		System.out.println("22가 있는가? "+set.contains(22));
		System.out.println("33제거 : "+set.remove(33));
		System.out.println("55제거 : "+set.remove(55));
		System.out.println(set);
		
		System.out.println("--------------");
		set.clear();
		System.out.println("비었는가? "+set.isEmpty());
		System.out.println(set);
	}
}
