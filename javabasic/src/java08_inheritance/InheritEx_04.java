package java08_inheritance;

class Parent4{
	protected int num;
	
	public Parent4() {		
		System.out.println("부모 디폴트 생성자");
	}
	
	public Parent4(int num) {
		this.num=num;
		System.out.println("부모 매개변수가 있는 생성자");
	}
}

class Child4 extends Parent4{
	int num;
	public Child4() {
		super(); 		//디폴트로 처리됨 자식생성자 만들면 항상 있음
		System.out.println("자식 디폴트 생성자");
	}
	public Child4(int num) {
//		super(num);
		
		//부모클래스에 선언된 num변수 접근하기
		super.num=num;	//부모클래스의 num = 지역변수 num
		this.num=num;	//자식클래스의 num = 지역변수 num
		System.out.println("자식의 매개변수있는 생성자");
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {	
		//부모클래스의 디폴트 생성자 호출
		Child4 c = new Child4();	
		System.out.println("=============");
		
		//기본적으로는 부모클래스의 디폴트 생성자 호출
		//super() 생정자를 이용하여 부모클래스의 다른 생성자
		//호출하는것 가능
		Child4 c2 = new Child4(5);	
		System.out.println("=============");
	}
}
