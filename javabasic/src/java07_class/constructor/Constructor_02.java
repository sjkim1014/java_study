package java07_class.constructor;

public class Constructor_02 {
	private int num1;
	private int num2;
	
	public Constructor_02() {
		this(100,200);	
		System.out.println("����Ʈ ������");
	}
	
	public Constructor_02(int num1) {
		this(num1,200);
		System.out.println("�Ű����� 1���� ������");
	}
	
	public Constructor_02(int num1, int num2) {
		System.out.println("�Ű����� 2���� ������");
		this.num1=num1;
		this.num2=num2;
	}
	
	public void out() {
		System.out.println("("+num1+","+num2+")");
	}

}
