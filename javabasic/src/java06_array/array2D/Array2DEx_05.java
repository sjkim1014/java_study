package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_05 {
	public static void main(String[] args) {
		//new : �����Ҵ� ������
		
		// ** �Ҵ� : �޸� ���� ����
		// ** ����<->����
		//���� : ������, Run-time
		//���� : ������, Compile-time
		
		//���� �Ҵ�
		int num; //int�� ���� ���� -> �������� �Ҵ����
		//�����Ҵ�
		int[] arr; //int�� �迭 ���� ���� -> �����Ҵ�
		arr=new int[5]; //int[5] ���� -> �����Ҵ�
		
		//����� ���ÿ� �ʱ�ȭ
		int[] a=new int[5];
		//����� ������ �Ѳ����� �ۼ��Ǿ�����
		//�����Ҵ�(��������), �����Ҵ�(�迭����)
		//��������� �ٸ���
		
		int[][] ar = new int[3][];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ar.length; i++) {
			System.out.println(i+"�� �迭�� ũ���? ");
			int len=sc.nextInt();
			ar[i]=new int[len];
		}
		
		
		
	}
}
