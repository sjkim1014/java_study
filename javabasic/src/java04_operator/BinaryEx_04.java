package java04_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//이항연산자 - 논리
		//&& || !
		// (!는 단항연산자)
		
		// 논리값(true/false, 참/거짓)의 논리식 결과를 반환
		// 논리값의 관계를 따지는 연산자
		
		// 논리식 : AND(&&) OR(||) XOR NOT(!)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("and : "+(b1&&b2));
		System.out.println("or : "+(b1||b2));
		System.out.println("XORNOT true : "+(!b1));
		System.out.println("XORNOT false : "+(!b2));
		
		//논리연산의 주목적
		// 관계연산의 결과를 조합할 때 사용한다
		// (관계연산의 결과는 논리값)
		
		int num = 57;
		System.out.println((num>=1) && (num<=100));
		//1.num이 1보다 크거나 같은가 ? 트루
		//2.num이 100보다 작거나 같은가? 트루
		//3.1.명제와 2명제 결과가 동시에 트루인가?
		//	-> num은 1부터 100사이의 숫자인가?
		
		System.out.println(!((num>=1) && (num<=100)));
		System.out.println((num>=1) || (num<=100));
		
	}

}
