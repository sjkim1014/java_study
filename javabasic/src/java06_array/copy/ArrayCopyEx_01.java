package java06_array.copy;

import java.util.Scanner;

public class ArrayCopyEx_01 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//��������(shallow copy)
		//������ ������ �������� ����� ���
		//������ ���纻 ������ ���� �������� ������
		
		arr2 = arr1;
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
