package java14_exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println("try���");
		}catch(ArithmeticException | NullPointerException e) {
			//ArithmeticException ���ܰ�ü��
			//NullPointerException ���ܰ�ü �߻� ��Ȳ ��� ó��
			e.printStackTrace();
		}
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
