package java14_exception;

public class ExceptionEx_01_Basic {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			int i=0;
			while(true) {
				//예외처리코드
//				if(i>=arr.length) {
//					System.out.println("인덱스는 " +arr.length+"보다 작아야함");
//					break;
//				}			
				arr[i] = i+1;
				System.out.println(arr[i]);
				i++;
			}
		}catch(Exception e) {
			System.out.println("인덱스벗어남");
//			e.printStackTrace();
		}
		System.out.println("+ + + 프로그램 종료  + + +");
	}
	
	
}
