package java07_class.field;

public class MemberField_03 {
	//인스턴스변수
	private int num = 777;
	
	//클래스변수
	private static int num2 = 666;
	
	//int var - 매개변수, parameter
	public void method(int var) {
		// int num - 지역변수, Local Variable
		int num=101;
		System.out.println(var);
		System.out.println(num);	//가까운변수는 그냥 
		System.out.println(this.num);//인스턴스변수로 접근하고자할땐 this
		System.out.println(MemberField_03.num2);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		MemberField_03.num2 = num2;
	}
	
	
	
}
