package java06_array.basic;

import java.util.Scanner;

public class ArrayEx_04 {
	public static void main(String[] args) {
		
		//���� �迭, char Array
		
		char[] chArr = {'A','p','p','l','e'};
		
		for(int i=0; i<chArr.length; i++) {
			System.out.print(chArr[i]);
			
		}

		String str = "Apple";
		
		//���ڿ��� ��� Ȱ���ϱ�
		System.out.println(str.charAt(3));
		
		//���ڿ��� ����
		 System.out.println(str.length());
		 
		 char[] result = str.toCharArray();
		 System.out.println("char[]�� ���� : "+result.length);
		 
		 System.out.println("------------");
		 
		 Scanner sc = new Scanner(System.in);
		 char ch = sc.nextLine().charAt(0);
		 
		 System.out.println(ch);
		
	
	}
}
