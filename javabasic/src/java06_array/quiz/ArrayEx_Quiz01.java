package java06_array.quiz;

import java.util.Scanner;

public class ArrayEx_Quiz01 {
	public static void main(String[] args) {
		
//		5���� �ǹ��� �ο��� �Է� �޵��� ������ ��ü �ο���
//		�������� �ϰ� �Ͽ���.
//		���� �� ������ ������ �����Ѵ�.
//		(������� �ο��� 12000�� �̴�.)
//
//		��Ʈ . 
//		- �ʿ��� �迭
//		 1. ������ ��� �ο��� ��� �迭 arr[6]
//		   // 1~5�� �� ���ο� 
//		   (������ �迭������ �Է¹��� �ο��� �� ������ ���) 
//
//		 2. ������ ������ �迭 arr2[6]
//		   // 1~5�� �� �� ������ �ݾ� 
//		   (������ �迭������ �������� �� �հ�ݾ����� ���)
//
//		----------------------- �Է� (�Է½� for���� �̿��Ѵ�.)
//		1���� ��� �ο��� ? 4
//		2���� ��� �ο��� ? 5
//		3���� ��� �ο��� ? 11
//		4���� ��� �ο��� ? 2
//		5���� ��� �ο��� ? 8
//		----------------------- ��� (��½� for ���� �̿��Ѵ�.)
//		1���� �� ������ : 48000��
//		2���� �� ������ : 60000��
//		3���� �� ������ : 132000��
//		4���� �� ������ : 24000��
//		5���� �� ������ : 96000��
//
//		�ǹ��� ��� �� �ο��� 30���Դϴ�.
//		�������� �� �ݾ��� 360000�� �Դϴ�.

		int[] people,money;
        Scanner sc=new Scanner(System.in);
        people = new int[6];
        money = new int[6];        
        
        System.out.println("------�Է�---------");
        for(int i=0; i<5;i++) {
           System.out.print((i+1)+"���� ��� �ο��� ? ");
           people[i] = sc.nextInt();
           people[5]+=people[i];
        }               
        System.out.println();
        System.out.println();           
        System.out.println("-------���--------");
        for(int i=0; i<5; i++) {
           money[i]=people[i]*12000;
           System.out.println((i+1)+"���� �� ������ : "+money[i]+"��");
           money[5]+=money[i];     
        }        
        System.out.println();
        System.out.println();
        System.out.println("�ǹ��� ��� �� �ο��� "+people[5]+"���Դϴ�.");
        System.out.println("�������� �� �ݾ��� "+money[5]+"�� �Դϴ�.");
	}

}

