package java05_control.whileEx;

import java.util.Scanner;

public class WhileEx_03_Quiz {
	public static void main(String[] args) {
		//�����ϳ��� �Է¹ް�
		//1���� �Է��Ѽ��ڱ���
		//�����ڸ� ���ؼ� ����ϱ�
		//(while �̿�)
		
		int i,num,sum=0;		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input number : ");
		num=sc.nextInt();
		
		i=1;
		while(i<=num) {
			sum+=i;
			i++;
		}
		
		System.out.println("��� : "+sum);		
	}
}
