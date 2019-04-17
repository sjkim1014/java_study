package java08_inheritance;

class Parent2{
	//protected : 같은 패키지 + 자식클래스의 접근 허용
	protected int num=11;
	
	public void print() {
		System.out.println(num);
	}
}

class Child2 extends Parent2{
	//부모클래스의 멤버필드와 같은이름으로
	//변수를 생성하는 것은 좋지 않다.
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
