package java05_control.forEx;

public class ForEx_06 {
	public static void main(String[] args) {
		
		//ù���� 10���� �����ϰ�
		//���������� ������ 2�踦
		//�����ϴ� �������
		//����(15��)���� ������ �ݾ���?
		//->327670
		int sum=10; // �����ϴ±ݾ�
		int total=0; //�ܰ�
		int i; //��¥ 
		
		for(i=1; i<=15; i++) {					
			total += sum;	
			sum = sum*2;	
		}
		System.out.println(total);
		
		//�ݺ�Ƚ�� : 15
		//�ݺ����� : 1~15
		
		//�ʱ�� : i=1
		//���ǽ� : i<=15
		//������ : i++
	}
}
