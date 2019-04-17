package java06_array.basic;

public class ArrayEx_03 {
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		//배열의 길이(=크기=요소의개수)
		
		System.out.println("배열의 길이 : "+arr.length);
		
		// . : 참조연산자
		//참조형 변수의 데이터나 기능을 사용할 수 잇게한다
		// ex) arr.length -> arr배열의 길이 데이터 사용
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	
	}
}
