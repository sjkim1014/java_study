package java04_operator;

public class BinaryEx_01 {
	public static void main(String[] args){
		// ���׿����� - ���
		// + - * / %
		
		int num1=17, num2=4, result;
		
		result = num1+num2;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.println("----------");
		//int�� int���꿡�� ����� double�� ������ ����ȯ �ʿ�
		System.out.println((double)num1/num2);
		System.out.println();
		System.out.println("----------");
		
		double d = 3.14;
		System.out.println("d/2 = "+d/2);
		
		System.out.println("-----");
		System.out.println("d%2 = "+d%2);
		//������� �Ҽ��� 00000001 �� �Ǽ����� ����
		//��ǻ�Ϳ��� ��¿������ �߻��Ѵ�. �����ϼ���
		
		//���׿����� �׻� �ǿ����ڵ��� ������Ÿ���� ��ġ�ؾ��Ѵ�
		//���׿����� ����� �ǿ������� ������Ÿ�԰� ����
		
	}

}
