package java14_exception;

public class ExceptionEx_06_throw {
	public static void main(String[] args) {
	
			
		// ������ ���ܰ� �߻���
//		throw new NullPointerException();
		
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("�� ������ ���� ���� �߻�");
		}catch(Exception e) {
			System.out.println("��� ���� ó��");
		}finally {
			System.out.println("������ ����Ǵ� �ڵ�");
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
