package java07_class.constructor;

import java.util.Scanner;

public class Constructor_01 {
	private int num1;
	private int num2 = 200;
	
	private Scanner sc;	//�Է°�ü
	
	//������
	public Constructor_01() {
		//�ƹ��� ���۵� ���� �ʴ´�
		sc = new Scanner(System.in);
		num1 = 100; 
		num2 = 300;	//����ʵ� �ʱ�ȭ ���� ������
	}
	
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void Constructor_01() {
		//�Ϲݸ޼ҵ�, �����ھƴ�(��ȯŸ���� �ձ⶧����, �����ε����ƴ�)
		System.out.println("�Ϲݻ������Դϴ�.");
		System.out.println("������ �ƴϿ���!");
	}
	
	public void out() {
	
		System.out.println("("+num1+","+num2+")");
	}
	
}
