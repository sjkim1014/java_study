package java07_class.basic;
//�Ϲ� Ŭ���� ����
public class ClassEx_03 {
	private int num1=10;
	int num2 = 20; //default
	protected int num3 = 30;
	public int num4 = 40;
	
	public void out() {
		System.out.println(num1);
	}
	
	//num1 ������ getter
	public int getNum1() {
		return num1;
	}
	
}
