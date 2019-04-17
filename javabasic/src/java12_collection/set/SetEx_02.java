package java12_collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx_02 {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		
		set1.add(1);	set1.add(2);	set1.add(3);
		set2.add(3);	set2.add(4);	set2.add(5);
		set3.add(1);	set3.add(2);
		
		//set2는 set1의 부분집합인가
		System.out.println("set1이 set2를 포함하는가? "+set1.containsAll(set2));
		
		//set3가 set1의 부분집합인가		
		System.out.println("set1이 set3를 포함하는가? "+set1.containsAll(set3));
		
		
//		System.out.println("---------합집합----------");
//		set1.addAll(set2);		// 두가지를 합친다.
//		System.out.println(set1);
//		System.out.println(set2);
		
//		System.out.println("----------교집합--------");
//		set1.retainAll(set2);	//두가지중 같은것만 나온다
//		System.out.println(set1);
		
		System.out.println("---------차집합----------");
		set1.removeAll(set2);
		System.out.println(set1);
		
	}
}
