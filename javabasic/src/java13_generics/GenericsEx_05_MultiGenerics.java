package java13_generics;

class Class05<T1, T2>{
	private T1 data1;
	private T2 data2;
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	public <K1, K2> K2 change(K1 data) {
		K2 result = (K2)data;
		
		return result;
	}
	
	
}

public class GenericsEx_05_MultiGenerics {
	public static void main(String[] args) {
		//T1 - Integer, T2 - String
		Class05<Integer, String> c05 = new Class05<>();
		
		c05.setData1(new Integer(111));	//T1 data1;
		c05.setData2("Apple");	//T2 data2;
		
		//---------------------------
		
		Integer num = 100;
		Double res = c05.<Integer,Double>change(num);	// 자동으로 타입결정
//		Double res2 = c05.<Integer,Double>change(num);	
		
		
	}
}













