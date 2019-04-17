package java05_control.doWhileEx;

import java.util.Scanner;

public class DoWhileEx_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//99가 될때까지 반복
		//입력값이 99라면 종료
		
		int num;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			System.out.println(">> "+num);
			
		}while(num!=99);
		
//		int num;
//		while(true) {
//			System.out.print("숫자를 입력하세요 : ");
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
