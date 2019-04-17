package java08_inheritance;

class Parent3{
	int pNum=11;
	
	public void display() {
		System.out.println("부모메소드");
	}
}

class Child3 extends Parent3{
	int cNum=22;
	@Override
	public void display() {
		System.out.println("자식메소드");	
	}
	public void print() {
		System.out.println("자식의 고유 메소드");
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
		
		//부모타입이 자식타입을 품을수 있다.
		p2=c2;	// Parent3 <- Child3
		System.out.println(c2.cNum);
//		System.out.println(p2.cNum);	//안됨 데이터손실잃어남
		System.out.println(((Child3)p2).cNum);
		
		
		System.out.println("--------");
//		Child3 c3 = new parent3(); //Error
//		Child3 c3 = (Child3)new Parent3(); //문법상으로는 문제가없지만 실행하면 오류
		
		System.out.println("--------");
		
		Parent3 pc =new Child3();
		pc.display();
		
	}
}
