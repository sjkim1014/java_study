package java13_generics;

class TestClass<T>{
	private T var1;
	protected T var2;
	
	public int num;
	String str;
	
	public void setVar1(T var) {
		this.var1 = var1;
	}
	
	//���׸��޼ҵ�
	public<E> void out() {
		T v1;
		E v2;
	}
}

//���׸� �������̽�
interface TestInterface<T>{
	public void set(T v);
	public <E> void out(); //���׸� �߻� �޼ҵ�
}

public class GenericsEx_02_Basic {
	public static void main(String[] args) {
		
				
		
	}
}
