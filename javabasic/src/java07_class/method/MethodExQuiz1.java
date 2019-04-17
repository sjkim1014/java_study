package java07_class.method;

public class MethodExQuiz1 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		
		MethodQuiz1 m01 = new MethodQuiz1();

		m01.mul10(arr);
		m01.print(arr);
		System.out.println("-----------");
		
		int[] res=m01.mul10_v2(arr2);		
		m01.print(res);
		
		
	}
}
