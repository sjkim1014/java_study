package java11_api;

import java.util.Date;

public class MathEx {
	public static void main(String[] args) {
		//-10�� ���밪
		//3.7�� �ø���
		//3.7�� ������
		//2.1�� 3������
		//0.0(����) ~ 1.0(����) ������ ���� (����)
		//�ڿ���� e�� 3.3����
		//-3.7�� �ø���
		//-3.7�� ������
		
		System.out.println(new Date().getTime());
		System.out.println(Math.abs(-10)); // ���밪 Math.abs();
		System.out.println(Math.ceil(3.7));	//�ø���  Math.ceil();
		System.out.println(Math.floor(3.7));	//������  Math.floor();
		System.out.println(Math.pow(2.1, 3)); //������ Math.pow(��,�����Ұ�);
		System.out.println(Math.random());	// ���� Math.random();
		System.out.println(Math.exp(3.3)); //�ڿ���� e : Math.E
		System.out.println(Math.ceil(-3.7));	//�ø���
		System.out.println(Math.floor(-3.7));	//������
		
	}
}
