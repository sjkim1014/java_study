package java13_generics;

class Class04{
	//���׸� �޼ҵ�
	public <T> void display(Integer num) {
		T data; // �������� ���� Ÿ���Ķ���� ���		
		data = (T) num;	// ����ȯ�����ڷ� Ÿ���Ķ���� ���
	}
	
	public <T> T out(T obj) {
		T data;
		data = obj;
		return data;
	}
}

public class GenericsEx_04_GenericMethod {
	public static void main(String[] args) {
		Class04 c04 = new Class04();
		
		c04.display(123);	//Ÿ���Ķ���� ���޾���. T -> Object		
		c04.<Double>display(456);	//Ÿ���Ķ���� Double�� ����
		
		int s = c04.out(123);	//�������� Ÿ�Կ� ���� �ڵ�������, T->Integer
		c04.out("Apple");	//T -> String �ڵ� ����
		
		c04.<Integer>out(456);	//Ÿ���Ķ���� ��������, T->Integer
//		c04.<Integer>out("Cherry");	//Ÿ�Ծ�����, ����
		
		
	}
}
