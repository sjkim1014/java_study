package java08_inheritance;

class Parent4{
	protected int num;
	
	public Parent4() {		
		System.out.println("�θ� ����Ʈ ������");
	}
	
	public Parent4(int num) {
		this.num=num;
		System.out.println("�θ� �Ű������� �ִ� ������");
	}
}

class Child4 extends Parent4{
	int num;
	public Child4() {
		super(); 		//����Ʈ�� ó���� �ڽĻ����� ����� �׻� ����
		System.out.println("�ڽ� ����Ʈ ������");
	}
	public Child4(int num) {
//		super(num);
		
		//�θ�Ŭ������ ����� num���� �����ϱ�
		super.num=num;	//�θ�Ŭ������ num = �������� num
		this.num=num;	//�ڽ�Ŭ������ num = �������� num
		System.out.println("�ڽ��� �Ű������ִ� ������");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {	
		//�θ�Ŭ������ ����Ʈ ������ ȣ��
		Child4 c = new Child4();	
		System.out.println("=============");
		
		//�⺻�����δ� �θ�Ŭ������ ����Ʈ ������ ȣ��
		//super() �����ڸ� �̿��Ͽ� �θ�Ŭ������ �ٸ� ������
		//ȣ���ϴ°� ����
		Child4 c2 = new Child4(5);	
		System.out.println("=============");
	}
}
