package java09_abstract.interfaceEx;

interface Inter_01{
	public void out();
	
}
interface Inter_02{
	public void out();
}

class Parent{
	public void out() {
		System.out.println("부모메소드");
	}
	
}
class Child extends Parent implements Inter_01,Inter_02{
	
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.out();
		
		//extend한 부모클래스 타입의 객체에
		//자식 클래스의 인스턴스 대입 가능
		Parent p =  new Child(); // 부모 <- 자식
		
		
		//implements한  부모인터페이스 타입의 객체에
		//자식클래스의 인스턴스 대입 가능
		Inter_01 i01 =new Child();	//부모 <- 자식
		Inter_02 i02 =new Child();	//부모 <- 자식
		
		i01.out();
		i02.out();
		
		//인터페이스는 객체생성 불가
//		Inter_01 i03 = new Inter_01(); // 인스턴스화 불가
	}
}



// 자바는 다중상속을 금지하고 있다
// ** 다중상속 : 하나의 클래스가 여러개의 클래스를 상속 받는 것
//
//	class Parent1{
//		public void out() {
//			
//		}
//	}
//	class Parent2{
//		public void out() {
//			
//		}
//	}
//	
//	class child extends Parent1, Parent2{
//		//어떤 out을 상속받아야하는지 모호해짐
//		//-> 자바는 이런상황을 막기위해 다중상속 금지시킴
//	}
































