package java13_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList<>();
//		list1.add(data); //data�� �޾ƾ� �ϱ� ������ 
						//���׸� E�� Object�� �ӽ� �����Ѵ�
		
		List<String> list2 = new ArrayList<>();
		//list2.add(data); // data�� StringŸ���̾�߸� �Ѵ�
							// => Ÿ�Ծ�����
		
		List<Integer> list3 = new ArrayList<>();
		//list3.add(data); // data�� IntegerŸ���̾�߸� ��
							//	=> Ÿ�Ծ�����		
		list2.add("AA");
//		list2.add(123);//Ÿ�Ծ�����
		
//		list3.add("BB");//Ÿ�Ծ�����
		list3.add(456);	
		
		list1.add("CCC");
		list1.add(123123);
		list1.add(true);
		
		//���ʿ��� ����ȯ �߻�
		String str = (String)list1.get(0);
		//Ÿ�Ծ����� �������� ����
		Integer num = (Integer)list1.get(2);
		Boolean b = (Boolean)list1.get(1);		//�����Ű�� ����
		
		System.out.println(str);
		System.out.println(num);
		System.out.println(b);

		
		
	}
}
