package java04_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//���׿����� - ��
		//&& || !
		// (!�� ���׿�����)
		
		// ����(true/false, ��/����)�� ���� ����� ��ȯ
		// ������ ���踦 ������ ������
		
		// ���� : AND(&&) OR(||) XOR NOT(!)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("and : "+(b1&&b2));
		System.out.println("or : "+(b1||b2));
		System.out.println("XORNOT true : "+(!b1));
		System.out.println("XORNOT false : "+(!b2));
		
		//�������� �ָ���
		// ���迬���� ����� ������ �� ����Ѵ�
		// (���迬���� ����� ����)
		
		int num = 57;
		System.out.println((num>=1) && (num<=100));
		//1.num�� 1���� ũ�ų� ������ ? Ʈ��
		//2.num�� 100���� �۰ų� ������? Ʈ��
		//3.1.������ 2���� ����� ���ÿ� Ʈ���ΰ�?
		//	-> num�� 1���� 100������ �����ΰ�?
		
		System.out.println(!((num>=1) && (num<=100)));
		System.out.println((num>=1) || (num<=100));
		
	}

}
