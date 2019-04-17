package java06_array.copy;

import java.util.Scanner;

public class ArrayCopyEx_02 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//�������� (deep copy)
		//���� ����� ���빰(�������)�� ���ο� ������ ����	
		
		//1. ���� ����(destination)�� ����Ȯ��
		//new �� �̿��Ͽ� ���ο� ������ �Ҵ��Ѵ�
		
		arr2 = new int[arr1.length];
		
		//2. for���� �̿��Ͽ� ���빰(�����)�� ����
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		
		
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
