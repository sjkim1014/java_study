package java07_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		Overloading_01 ol = new Overloading_01();
		
		ol.display();
		ol.display(10,20);
		
		Overloading_02 ol2 = new Overloading_02();
		System.out.println(ol2.getLength(123456789));
		System.out.println(ol2.getLength(123.456));
		System.out.println(ol2.getLength(true));
	}
}
