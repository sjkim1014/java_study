package java03_casting;

public class Casting_01 {
	public static void main(String[] args) {
		
		byte b = (byte) 14; //byte <- int
		System.out.println(b);
		
		int num = b;	//int <- byte
		System.out.println(num);
		
		int n1 = (int)3.14f;	//int <- float ��������ȯ �ʿ�
		float f1 = 12;		//float <- int �ڵ�����ȯ ����
		
		long n2 = (long)3.14;	//long <- double (��������ȯ
		double d1 = 5555L;	//double <- long �ڵ�����ȯ
	}

}
