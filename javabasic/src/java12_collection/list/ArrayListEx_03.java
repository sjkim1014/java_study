package java12_collection.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx_03 {
	public static void main(String[] args) {
		//�ݺ���, iterator
		// �÷����� ��ҵ��� ���������� �о���� ����� ǥ��ȭ ��Ų��
		
		List list = Arrays.asList("A","B","C","D","E");
		
		Iterator iter; //�ݺ��� ����(interface Interator)
		
		iter = list.iterator();
		
		while(iter.hasNext()) {		//�������� �ִ��� Ȯ��
			System.out.println(iter.next());	//next ���� ��������
		}
	}
}
