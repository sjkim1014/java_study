package java07_class.field;

public class MemberField_03 {
	//�ν��Ͻ�����
	private int num = 777;
	
	//Ŭ��������
	private static int num2 = 666;
	
	//int var - �Ű�����, parameter
	public void method(int var) {
		// int num - ��������, Local Variable
		int num=101;
		System.out.println(var);
		System.out.println(num);	//�������� �׳� 
		System.out.println(this.num);//�ν��Ͻ������� �����ϰ����Ҷ� this
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
