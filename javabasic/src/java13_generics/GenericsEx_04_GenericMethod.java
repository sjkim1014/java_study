package java13_generics;

class Class04{
	//제네릭 메소드
	public <T> void display(Integer num) {
		T data; // 지역변수 선언에 타입파라미터 사용		
		data = (T) num;	// 형변환연산자로 타입파라미터 사용
	}
	
	public <T> T out(T obj) {
		T data;
		data = obj;
		return data;
	}
}

public class GenericsEx_04_GenericMethod {
	public static void main(String[] args) {
		Class04 c04 = new Class04();
		
		c04.display(123);	//타입파라미터 전달안함. T -> Object		
		c04.<Double>display(456);	//타입파라미터 Double로 결정
		
		int s = c04.out(123);	//전달인자 타입에 의해 자동결정됨, T->Integer
		c04.out("Apple");	//T -> String 자동 결정
		
		c04.<Integer>out(456);	//타입파라미터 직접결정, T->Integer
//		c04.<Integer>out("Cherry");	//타입안정성, 에러
		
		
	}
}
