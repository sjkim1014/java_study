package java06_array.copy;

import java.util.Scanner;

public class ArrayCopyEx_03 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//�������� (deep copy)
		//���� ����� ���빰(�������)�� ���ο� ������ ����	
		
		//1. ���� ����(destination)�� ����Ȯ��
		//new �� �̿��Ͽ� ���ο� ������ �Ҵ��Ѵ�
		
		arr2 = new int[arr1.length];
		
		//2.System Ŭ������ api�޼ҵ带 �̿��Ͽ� ���빰 ����
		System.arraycopy(arr1,0,arr2,0,arr1.length);
//		arraycopy(
//			�����迭,
//			�����迭���� �б� �����ϴ� index,
//			�纻�迭
//			�纻�ֿ����� ����ϱ� �����ϴ� index,
//			�����迭���� �о���� ��� ����
//		)
		
		
		System.out.println("������");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		arr1[1]=999;
		
		System.out.println("������");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
	
	}
}
