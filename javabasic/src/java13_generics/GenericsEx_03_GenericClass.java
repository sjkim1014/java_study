package java13_generics;

class Class03<T>{
	private T obj;
	
	public <K> void display(K obj) {
		T data;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class GenericsEx_03_GenericClass {
	public static void main(String[] args) {
	
		// T -> String
		Class03<String> c03 = new Class03<>();
		
		c03.setObj("Apple");
		
		String fruit = c03.getObj();
		System.out.println("°úÀÏ : "+fruit);					
		
	}
}
