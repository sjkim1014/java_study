package java13_generics;

class Data<T>{
	T data;
}
class Class06<K>{
	public Data d1;
	public Data<K> d2;
	public Data<String> d3;
}

public class GenericsEx_06_ClassMember {
	public static void main(String[] args) {
		
		Class06<Integer> c06 = new Class06<>();
		
		c06.d1 = new Data<>();	//data
		c06.d1.data=null; //Object
		
		c06.d2.data=0; //Integer
		
		c06.d3.data=null; //String
		
		
	}
}













