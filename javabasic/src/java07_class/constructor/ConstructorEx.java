package java07_class.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		Constructor_01 c01; // 梓端識情
		c01 = new Constructor_01(); // 梓端持失
		
		c01.out();
		
		Constructor_01 c02 = new Constructor_01(11,22);
		c02.out();
		
		
		System.out.println("--------");
		Constructor_02 c03 = new Constructor_02();
		c03.out();
		System.out.println("--------");
		Constructor_02 c04 = new Constructor_02(777);
		c04.out();
		System.out.println("--------");
		Constructor_02 c05 = new Constructor_02(888,999);
		c05.out();
	}
}
