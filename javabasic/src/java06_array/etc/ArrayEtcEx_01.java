package java06_array.etc;

import java.util.Arrays;

public class ArrayEtcEx_01 {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		System.out.println(arr);
		
		String str = "Apple";
		System.out.println(str);
		//System.out.println�� ������ ������ �������� ����ϴ°��� �⺻
		//���ڿ� ��ŭ�� ��������Ǹ� ���� ���빰(���ڿ�)�� 
		//����ϵ��� �Ǿ��ִ�.
		//-> toString() �޼ҵ带 �̿��Ѵ�
		
		System.out.println(Arrays.toString(arr));
		//Array.toString(�迭����)
		//�迭�� ���빰�� ���ڿ��� �������ִ� API
	}
}
