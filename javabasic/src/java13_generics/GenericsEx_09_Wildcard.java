package java13_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_09_Wildcard {
	public static void display(List<?> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);		
		display(list);
		
		List<String> list2 = Arrays.asList("A","B","C");		
		display(list2);
		//-----------------------
		
		Object o = null;
		Integer i = null;
		o = i;
		
		//Object�� Integer�� �θ�Ŭ����
		//�ڽ�Ŭ����Ÿ���� �θ�Ŭ����Ÿ������ �ڵ�����ȯ
		
		//�θ�Ŭ���� ������ �ڽ�Ŭ���� ���� ���� ����
		
		//�θ�Ÿ���� �ڽ�Ÿ���� ǰ�´�
		//---------------------
		
		List<Object> oList=null;
		List<Integer> iList = null;
//		oList = iList;	// Ÿ���Ķ���ʹ� ��Ӱ��迡 ��������ʴ´�
	}
}











