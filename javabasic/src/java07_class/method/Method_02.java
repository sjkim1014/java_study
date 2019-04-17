package java07_class.method;

public class Method_02 {	
	public void method01() {
		System.out.println("hello");
	}
	
	public void method02(int parameter) {
		System.out.println("전달 인자 : " + parameter);
	}
	public void printNum2(int num1,double num2) {
		System.out.println("num1 : "+num1+" num2 : "+num2);
	}
	public int returnNum() {
		return 111;	//메소드를 종료시키며 int형 데이터를 반환
	}
	public int add(int num1,int num2) {
		int result = num1+num2;
		return result;	
	}
	
}
