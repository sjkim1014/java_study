package java14_exception;

public class ExceptionEx_03_Try {
	public static void main(String[] args) {
		int num1=9;
		int num2=0;
		try {	
			
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 예외 발생");
			System.out.println("[ERROR] 0으로 나눌수 없다");
		}
		
//		if(num2 !=0) {
//			System.out.println(num1/num2);
//		}else {
//			System.out.println("[WARN] 나눔수가 0 입니다.");
//		}
		System.err.println("에러메세지!!!");
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
