package java07_class.constructor;

public class Constructor_02 {
	private int num1;
	private int num2;
	
	public Constructor_02() {
		this(100,200);	
		System.out.println("디폴트 생성자");
	}
	
	public Constructor_02(int num1) {
		this(num1,200);
		System.out.println("매개변수 1개인 생성자");
	}
	
	public Constructor_02(int num1, int num2) {
		System.out.println("매개변수 2개인 생성자");
		this.num1=num1;
		this.num2=num2;
	}
	
	public void out() {
		System.out.println("("+num1+","+num2+")");
	}

}
