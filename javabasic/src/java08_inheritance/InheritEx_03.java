package java08_inheritance;

class Parent3{
	int pNum=11;
	
	public void display() {
		System.out.println("�θ�޼ҵ�");
	}
}

class Child3 extends Parent3{
	int cNum=22;
	@Override
	public void display() {
		System.out.println("�ڽĸ޼ҵ�");	
	}
	public void print() {
		System.out.println("�ڽ��� ���� �޼ҵ�");
	}
}

public class InheritEx_03 {
	public static void main(String[] args) {
		
		Parent3 p1 = new Parent3();	
		Child3 c1 = new Child3();
		
		System.out.println("--------");
		Parent3 child = new Child3();
		
		System.out.println("--------");
		Parent3 p2;
		Child3 c2 = new Child3();
		
		//�θ�Ÿ���� �ڽ�Ÿ���� ǰ���� �ִ�.
		p2=c2;	// Parent3 <- Child3
		System.out.println(c2.cNum);
//		System.out.println(p2.cNum);	//�ȵ� �����ͼս��Ҿ
		System.out.println(((Child3)p2).cNum);
		
		
		System.out.println("--------");
//		Child3 c3 = new parent3(); //Error
//		Child3 c3 = (Child3)new Parent3(); //���������δ� ������������ �����ϸ� ����
		
		System.out.println("--------");
		
		Parent3 pc =new Child3();
		pc.display();
		
	}
}
