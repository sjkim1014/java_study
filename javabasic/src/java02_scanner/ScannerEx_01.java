package java02_scanner;

//scanner Ŭ���� import
// import �ڵ� ���ķδ� Scanner ����ؼ� ��밡��
import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		// Scanner ��ü ����
		// Scanner Ÿ���� ���� ����
		
		//Scanner ��ü
		//Ű������ �Է��� ���� �� �ֵ��� ���ִ� ���
		Scanner sc = new Scanner(System.in);
		
		int num; // ��������
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();//������� �Է´��
		//Ű������ �Է��� �޾� �ش絥���͸� num������ ����
		//int �����̱� ������ int������ �Է��ؾ���
		
		//���
		
		System.out.println("�Է��� �� : " + num);	
	
		
		
	}
}
