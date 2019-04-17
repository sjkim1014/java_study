package java05_control.switchEx;

import java.util.Scanner;

public class SwitchExQuiz {
	public static void main(String[] args) {
		
		/*
		 * - 메뉴만들기
		 * 
		 * =====================
		 * M e n u
		 * =====================
		 * 1.Hello World 출력
		 * 2.이름출력
		 * 3.성별출력
		 * 4.종료
		 * 
		 * 
		 * */
		
		final int HELLO = 1;
		final int NAME = 2;
		final int SEX = 3;
		final int EXIT = 4;
		
		int i;
		String name="오민식",sex="남";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============");
		System.out.println("M E N U");
		System.out.println("==============");
		System.out.println("1.Hello World 출력");
		System.out.println("2.이름출력");
		System.out.println("3.성별출력");
		System.out.println("4.종료");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print(">> : ");
		i = sc.nextInt();
		
		switch(i) {
		case HELLO:
			System.out.println("Hello World");
			break;
		case NAME:
			System.out.println(name);
			break;
		case SEX:
			System.out.println(sex);
			break;
		case EXIT:
			System.out.println("종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
	}
}
