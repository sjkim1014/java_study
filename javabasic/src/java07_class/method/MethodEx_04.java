package java07_class.method;

import java.util.Scanner;

public class MethodEx_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		String op;
		char op1;
		
		Method_04 m04 = new Method_04();
		
		do {
			System.out.println("��ȣ�� 0�� ������ ����");
			System.out.println();
			System.out.print("��ȣ �Է� : ");
			op = sc.nextLine();
			op1=op.charAt(0);
			System.out.print("����1 �Է� : ");
			n1 = sc.nextInt();
			System.out.print("����2 �Է� : ");
			n2 = sc.nextInt();
			sc.nextLine();
			
			
			switch(op1) {
			case '+':
				System.out.println(n1+"+"+n2+"="+m04.sum(n1,n2));
				System.out.println();
				break;
			
			case '-':
				System.out.println(n1+"-"+n2+"="+m04.sub(n1,n2));
				System.out.println();
				break;
				
			case '*':
				System.out.println(n1+"*"+n2+"="+m04.mul(n1,n2));
				System.out.println();
				break;
				
			case '/':
				System.out.println(""+n1+op1+n2+"="+m04.div(n1,n2));
				System.out.println();
				break;
			case '0':
				System.out.println("����");
				break;
				
			default:
				System.out.println("�ٽ��Է��ϼ���");
				System.out.println();
				break;
			}
		}while(op1 != '0');
	}
}
