package java11_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {
		//���������� ���� �����
		//int user : ����� �Է� (1~3)
		//int com : ��ǻ�� ����(1~3)
		
		//1: ����, 2: ����, 3 : ��
		
		//1.Random�� �̿��Ͽ� com�� �� ����
			// com�� ���
		//2.user�� �Է¹ޱ�
		//3.com, user �� ( ���������� �º�)
		//4.��� ��� (����)
		
		//5. 1~4 �ݺ�
		
		int user,com;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			com = ran.nextInt(3)+1;
			System.out.println("com : "+com);
			System.out.print("����� �Է� : ");
			user = sc.nextInt();
			
			if(user>3 || user<1) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}else{
				if(com==1) {
					if(user==1) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (����) "+user+", �����ϴ�.");
					}
					if(user==2) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (����) "+user+", ����� ��");
					}
					if(user==3) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (��) "+user+", ��ǻ�� ��");
					}				
				}
				if(com==2) {
					if(user==1) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (����) "+user+", ��ǻ�� ��");
					}if(user==2) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (����) "+user+", �����ϴ�");
					}if(user==3) {
						System.out.println("��ǻ�� : (����) "+com+" ����� : (��) "+user+", ����� ��");
					}
					
				}
				if(com==3) {
					if(user==1) {
						System.out.println("��ǻ�� : (��) "+com+" ����� : (����) "+user+", ����� ��");
					}
					if(user==2) {
						System.out.println("��ǻ�� : (��) "+com+" ����� : (����) "+user+", ��ǻ�� ��");
					}
					if(user==3) {
						System.out.println("��ǻ�� : (��) "+com+" ����� : (��) "+user+", �����ϴ�.");
					}					
				}
			}
			
		}
	}
}
