package java07_class.method;

import java.util.Scanner;

public class MethodEx_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �ݺ� Ƚ�� : ");
		int inputnum = sc.nextInt();
		sc.nextLine();
		System.out.print("���ڿ� �Է� : ");
		String inputtext = sc.nextLine();
		
		
		Method_03 m03 = new Method_03();
		
		m03.hund();
		System.out.println();
		System.out.println();
		m03.word(inputnum);
		System.out.println();
		m03.text(inputnum,inputtext);
		
		
	}
}
