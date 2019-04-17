package java08_inheritance;

class Parent2{
	//protected : ���� ��Ű�� + �ڽ�Ŭ������ ���� ���
	protected int num=11;
	
	public void print() {
		System.out.println(num);
	}
}

class Child2 extends Parent2{
	//�θ�Ŭ������ ����ʵ�� �����̸�����
	//������ �����ϴ� ���� ���� �ʴ�.
	private int num = 33;
	@Override
	public void print() {		
		num=22;
		System.out.println(num);
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.print();
		
		Child2 c = new Child2();
		c.print();
		
		p.num=55;
	}
}
