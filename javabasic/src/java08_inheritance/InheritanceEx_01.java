package java08_inheritance;

class Parent{	//�θ�Ŭ����
	int num;
	String name;
	
	
	public void display() {
		System.out.println("�θ�Ŭ������ �޼ҵ�");
		
	}
}

class Child extends Parent{		//�ڽ�Ŭ����
	int score;
	
	@Override
	public void display() {
		System.out.println("�ڽ�Ŭ������ �޼ҵ�");
		System.out.println("�������̵�, Overriding");
	}
	
	public void print() {
		System.out.println("�ڽ� Ŭ���� ���� �޼ҵ�");
	}
}

public class InheritanceEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.num = 111;
		p.name = "Alice";
//		p.score = 90; // �ڽ����� �־ �ȵ�
		
		
		Child c = new Child();
		c.num=222;
		c.name = "bob";
		c.score = 80;
		
		System.out.println("----------");
//		p.display();
		c.display();
	
		
	}
}
