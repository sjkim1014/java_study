package java13_generics;

class TestClass<T>{
	private T var1;
	protected T var2;
	
	public int num;
	String str;
	
	public void setVar1(T var) {
		this.var1 = var1;
	}
	
	//제네릭메소드
	public<E> void out() {
		T v1;
		E v2;
	}
}

//제네릭 인터페이스
interface TestInterface<T>{
	public void set(T v);
	public <E> void out(); //제네릭 추상 메소드
}

public class GenericsEx_02_Basic {
	public static void main(String[] args) {
		
				
		
	}
}
