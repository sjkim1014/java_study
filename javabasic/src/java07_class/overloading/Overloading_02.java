package java07_class.overloading;

public class Overloading_02 {
	//�������� ���ڼ��� ���� ��ȯ
	//112233 -> 6 ��ȯ
	public int getLength(int num) {
		//int -> String
		// 112233 -> "112233"		
		String str = String.valueOf(num); // int�� string���� ��ȯ�����ִ� �Լ�		
		return str.length();
	}
	
	public int getLength(double num) {	
		String str = String.valueOf(num); 		
		return str.length();
	}
	
	public int getLength(Boolean num) {			
		String str = String.valueOf(num);		
		return str.length();
	}
	
//	��ȯŸ���� �ٲ��� �����ε��� �ȵ�	
//	public void getLength(int num) {
//		
//	}
	
	
}
