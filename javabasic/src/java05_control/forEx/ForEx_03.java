package java05_control.forEx;

public class ForEx_03 {
	public static void main(String[] args) {

		for(int num=10; num>=1; num--) {
			System.out.println(num);
			
//			�ݺ�Ƚ�� : 10�� 
//			�ݺ����� : 10-1;
		}
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		//�ݺ�Ƚ�� : 5 
		//�ݺ����� : 0 2 4 6 8 5ȸ 0+=2
		
		for(int j=0; j<7; j++) {
			System.out.println("hello");
		}
	}
}
