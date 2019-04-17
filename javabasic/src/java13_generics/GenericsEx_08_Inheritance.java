package java13_generics;

class Parent01<T>{
	T data1;
}

class Child01 extends Parent01<String>{
	//상속받은 타입 파라미터 String으로 결정하기
}

class Parent02<T>{
	
}

class Child02<K> extends Parent02<K>{
	//상속받은 타입파라미터 결정 미루기
}
class Parent03<M>{
	
}

class Child03<T1, T2> extends Parent03<T1>{
	//T1 : 상속받은 타입파라미터 결정 미루기
	//T2 : 자식클래스만의 타입파라미터 정의
}

interface Inter01<T1> {
	void method1(T1 data);
}
interface Inter02<T2> {
	void method2(T2 data);
}

class Class08<M> implements Inter01<M>, Inter02<M>{

	@Override
	public void method1(M data) {
	}

	@Override
	public void method2(M data) {	
	}
	
}

public class GenericsEx_08_Inheritance {
	public static void main(String[] args) {
		Child02<String> c02 = new Child02<>();
		
		Class08<Integer> c03 = new Class08<>();
		
		c03.method1(111);
		c03.method2(222);
	}
}











