package java05_control.doWhileEx;

public class DoWhileEx_01 {
	public static void main(String[] args) {
		//do-while loop
		//while���� ����		
		
//		do{
//			//�ݺ��ڵ�
//		}while(���ǽ�);
//		
		
		do {
			System.out.println("����̵Ƿ���");
		}while(false);
		
		//do-while���� ���� 1ȸ�� ������ �ݺ��ڵ� ����
		//������ ���ǰ˻��ϸ鼭 �ݺ�����
		
		System.out.println("---------");
		
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
	}
}
