package java14_exception;

public class ExceptionEx_03_Try {
	public static void main(String[] args) {
		int num1=9;
		int num2=0;
		try {	
			
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� �߻�");
			System.out.println("[ERROR] 0���� ������ ����");
		}
		
//		if(num2 !=0) {
//			System.out.println(num1/num2);
//		}else {
//			System.out.println("[WARN] �������� 0 �Դϴ�.");
//		}
		System.err.println("�����޼���!!!");
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
