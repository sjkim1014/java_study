package java04_operator;

public class BinaryEx_02 {
	public static void main(String[] args){
		
		//���׿����� - ����(Assign)
		//�����ʿ� �ִ� ���� ������ ������ ����
		
		//=��ȣ �������� �����;��ϰ�, ������ ������ �;��Ѵ�
	
		int num1=10, num2=20;
		System.out.println("---������---");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		num2+=num1;
		num2-=num1;
		num2*=num1;
		num2/=num1;
		num2%=num1;
		
		System.out.println("---������---");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

	}

}
