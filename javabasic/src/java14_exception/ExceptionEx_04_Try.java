package java14_exception;

public class ExceptionEx_04_Try {
	public static void main(String[] args) {
		try {
			//try ���
			//���ܰ� �߻��ϴ� �ڵ�
			//���� �߻��� �����Ǵ� �ڵ�
		}catch( ArithmeticException e ) {
			//ArithmeticException ���� ó�� �ڵ�
			System.out.println("��� ���� ����");
		}catch(NullPointerException e) {
			//NullPointerExcepiton ����ó���ڵ�
			System.out.println("NULL ����");
		}catch(Exception e) {
			//�� catch�������� ó���� �����ʴ�
			// ������ ��� ���ܸ� ó���ϴ��ڵ�
			System.out.println("������ ��� ���� ó��");
		}finally {
			// ������� �ʾƵ� �Ǵ� ���
			
			// ���ܰ� �߻��ص�
			// ���ܰ� �߻����� �ʾƵ�
			// ������ �����ϴ� �ڵ�
			
			//�ڿ������ڵ�
		}
		System.out.println("+ + + ���α׷� ���� + + +");
	}
}
