package java07_class.method;

public class MethodQuiz1 {
//	 1. 기능 클래스
//		//1번. 전달받은 배열의 모든 요소 10배 - mul10
//		public void mul10(int[] arr)
//
//		//2번. 전달받은 원본배열을 모두 10곱한 값을
//		// 가지는 새로운 배열 반환 - mul10_v2
//		public int[] mul10_v2(int[] arr)
//
//		//3번. 배열의 모든 요소 출력 - print
//		public void print(int[] arr)
//
//	    2. 실행 클래스
//		int[] arr = { 1,2,3,4,5 };
//		//1. 배열의 모든 요소 10배
//		//2. 배열의 모든 요소 출력
//			
//		int[] arr2 = { 6,7,8,9,10 };
//		//1. 원본배열은 그대로 두고 모든요소를 10배한 새로운배열을 반환한다
//		//2. 배열의 모든 요소 출력

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
