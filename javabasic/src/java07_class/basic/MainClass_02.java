package java07_class.basic;
//�Ϲ� Ŭ���� ����
public class MainClass_02 {
	
	//����ʵ�
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
	