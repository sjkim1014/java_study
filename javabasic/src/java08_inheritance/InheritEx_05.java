package java08_inheritance;

class Parent5{
	public void display() {
		System.out.println("부모 메소드");
	}
}
//더이상 상속을 줄수 없는 클래스
//final class Child5 extends Parent5
//}
class Child5 extends Parent5{
	@Override
	//더이상 재정의 될수 없는 메소드
	public final void display() {
		System.out.println("자식 메소드");
	}
}

class GrandChild extends Child5{
//	@Override
//	public void display() {
//		System.out.println("두번 재정의한 메소드");
//	}
}

public class InheritEx_05 {
	public static void main(String[] args) {	
		GrandChild gc = new GrandChild();
		gc.display();
	}
}
