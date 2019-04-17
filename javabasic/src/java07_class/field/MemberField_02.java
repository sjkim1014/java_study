package java07_class.field;

public class MemberField_02 {
	//클래스변수
	private static String fruit = "grape";

	public static String getFruit() {
		return fruit;
	}

	public static void setFruit(String fruit) {
		MemberField_02.fruit = fruit;
	}
	
	
}
