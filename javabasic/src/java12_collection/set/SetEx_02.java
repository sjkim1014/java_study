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
		
		//set2�� set1�� �κ������ΰ�
		System.out.println("set1�� set2�� �����ϴ°�? "+set1.containsAll(set2));
		
		//set3�� set1�� �κ������ΰ�		
		System.out.println("set1�� set3�� �����ϴ°�? "+set1.containsAll(set3));
		
		
//		System.out.println("---------������----------");
//		set1.addAll(set2);		// �ΰ����� ��ģ��.
//		System.out.println(set1);
//		System.out.println(set2);
		
//		System.out.println("----------������--------");
//		set1.retainAll(set2);	//�ΰ����� �����͸� ���´�
//		System.out.println(set1);
		
		System.out.println("---------������----------");
		set1.removeAll(set2);
		System.out.println(set1);
		
	}
}
