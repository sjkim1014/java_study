package java08_inheritance;

class Parent5{
	public void display() {
		System.out.println("�θ� �޼ҵ�");
	}
}
//���̻� ����� �ټ� ���� Ŭ����
//final class Child5 extends Parent5
//}
class Child5 extends Parent5{
	@Override
	//���̻� ������ �ɼ� ���� �޼ҵ�
	public final void display() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}

class GrandChild extends Child5{
//	@Override
//	public void display() {
//		System.out.println("�ι� �������� �޼ҵ�");
//	}
}

public class InheritEx_05 {
	public static void main(String[] args) {	
		GrandChild gc = new GrandChild();
		gc.display();
	}
}
