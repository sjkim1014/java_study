package java14_exception;

public class ExceptionEx_01_Basic {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			int i=0;
			while(true) {
				//����ó���ڵ�
//				if(i>=arr.length) {
//					System.out.println("�ε����� " +arr.length+"���� �۾ƾ���");
//					break;
//				}			
				arr[i] = i+1;
				System.out.println(arr[i]);
				i++;
			}
		}catch(Exception e) {
			System.out.println("�ε������");
//			e.printStackTrace();
		}
		System.out.println("+ + + ���α׷� ����  + + +");
	}
	
	
}
