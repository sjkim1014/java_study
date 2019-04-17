package java12_collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx_02 {
	public static void main(String[] args) {
		
		//<> �� Generic�� �����ϴ°�
		// �������� ������ objectŸ���� ������ �Ͱ� ���
		List list1 = new ArrayList();
		
		//String��Ҹ� �ٷ���ִ� ArrayList ����
		List<String> list2 = new ArrayList<>();
		
		//Integer ��Ҹ� �ٷ�� ArrayList
		List<Integer> list3 = new ArrayList<Integer>();
		
		
		list2.add("Apple");
//		list2.add(123);	//<String>���� ���ѵǾ�����
		
		list3.add(123);
		list3.add((int)12.345); //<Integer>���� ���ѵ�
		
		System.out.println(list2);
		System.out.println(list3);
		
		System.out.println("-------------------");
		List intList = Arrays.asList(1,2,3,4,5);
		// int[] arr ={1,2,3,4,5};
		System.out.println(intList);
		
		List strList = Arrays.asList("Alice", "Bob", "Clare");
		System.out.println(strList);
	}
}
















