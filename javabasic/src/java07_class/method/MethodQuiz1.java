package java07_class.method;

public class MethodQuiz1 {
//	 1. ��� Ŭ����
//		//1��. ���޹��� �迭�� ��� ��� 10�� - mul10
//		public void mul10(int[] arr)
//
//		//2��. ���޹��� �����迭�� ��� 10���� ����
//		// ������ ���ο� �迭 ��ȯ - mul10_v2
//		public int[] mul10_v2(int[] arr)
//
//		//3��. �迭�� ��� ��� ��� - print
//		public void print(int[] arr)
//
//	    2. ���� Ŭ����
//		int[] arr = { 1,2,3,4,5 };
//		//1. �迭�� ��� ��� 10��
//		//2. �迭�� ��� ��� ���
//			
//		int[] arr2 = { 6,7,8,9,10 };
//		//1. �����迭�� �״�� �ΰ� ����Ҹ� 10���� ���ο�迭�� ��ȯ�Ѵ�
//		//2. �迭�� ��� ��� ���

	public void mul10(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]*=10;			
		}		
	}
	

	public int[] mul10_v2(int[] arr) {
		for(int i=0; i<arr.length; i++) {			
			arr[i]*=10;					
		}
		return arr;			
	}	
	
	public void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
