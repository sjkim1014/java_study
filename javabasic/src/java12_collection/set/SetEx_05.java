package java12_collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SetEx_05 {
	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet<>();
		
		tree.add("Banana");
		tree.add("Durian");
		tree.add("Apple");
		tree.add("Cherry");
		
		System.out.println(tree);
		
		System.out.println("-------------");
		Set head = tree.headSet("Cherry");
		System.out.println(head);
		
		Set tail = tree.tailSet("Cherry");
		System.out.println(tail);
		
		Set sub = tree.subSet("Banana","Cherry");
		System.out.println(sub);
	}
}
