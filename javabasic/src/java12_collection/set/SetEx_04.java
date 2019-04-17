package java12_collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx_04 {
	public static void main(String[] args) {
		
		Set set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
