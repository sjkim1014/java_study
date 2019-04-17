package java07_class.basic;
//일반 클래스 정의
public class MainClass_02 {
	
	//멤버필드
	int num1=111;
	int num2=222;
	
	private int num3=0;
	
	public static void main(String[] args) {
		MainClass_02 mc02 = new MainClass_02();
		mc02.out();
	}
	
	public void out() {
		System.out.println(num1+", "+num2);
	}
}
	