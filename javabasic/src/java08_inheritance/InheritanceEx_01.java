package java08_inheritance;

class Parent{	//부모클래스
	int num;
	String name;
	
	
	public void display() {
		System.out.println("부모클래스의 메소드");
		
	}
}

class Child extends Parent{		//자식클래스
	int score;
	
	@Override
	public void display() {
		System.out.println("자식클래스의 메소드");
		System.out.println("오버라이딩, Overriding");
	}
	
	public void print() {
		System.out.println("자식 클래스 전용 메소드");
	}
}

public class InheritanceEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.num = 111;
		p.name = "Alice";
//		p.score = 90; // 자식한테 있어서 안됨
		
		
		Child c = new Child();
		c.num=222;
		c.name = "bob";
		c.score = 80;
		
		System.out.println("----------");
//		p.display();
		c.display();
	
		
	}
}
