package java05_control.doWhileEx;

import java.util.Scanner;

public class DoWhileEx_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//99�� �ɶ����� �ݺ�
		//�Է°��� 99��� ����
		
		int num;
		
		do {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			System.out.println(">> "+num);
			
		}while(num!=99);
		
//		int num;
//		while(true) {
//			System.out.print("���ڸ� �Է��ϼ��� : ");
//			num = sc.nextInt();
//			System.out.println(">> "+num);
//			
//			if(num==99) {
//				break;
//			}
//			
//		}
	}
}
