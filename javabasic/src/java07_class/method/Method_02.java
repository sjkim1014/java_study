package java07_class.method;

public class Method_02 {	
	public void method01() {
		System.out.println("hello");
	}
	
	public void method02(int parameter) {
		System.out.println("���� ���� : " + parameter);
	}
	public void printNum2(int num1,double num2) {
		System.out.println("num1 : "+num1+" num2 : "+num2);
	}
	public int returnNum() {
		return 111;	//�޼ҵ带 �����Ű�� int�� �����͸� ��ȯ
	}
	public int add(int num1,int num2) {
		int result = num1+num2;
		return result;	
	}
	
}
