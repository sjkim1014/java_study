package java07_class.method;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Random ran = new Random();
		int com = ran.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		int num,count=6;
		
		while(true) {
			System.out.print("1~50 ���ڸ� �Է����ּ��� ");
			num = sc.nextInt();
			if(num>50 || num<1) {
				System.out.println("���ڸ� �߸��Է��߽��ϴ�.");
				break;
			}			
			
			if(com>num) {
				System.out.println("UP! ������ȸ : "+count);
			}else if(com<num) {
				System.out.println("DOWN! ������ȸ : "+count);
			}else if(com==num) {
				System.out.println(com+"�� "+num+"�� �����ϴ�. ����!  ������ȸ : "+count);
				break;
			}
			
			count--;
			if(count==-1) {
				System.out.println("7���ȿ� ��������ϴ�");
				break;
			}			
		}
		
	}
}
