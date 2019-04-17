package java14_exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println("try블록");
		}catch(ArithmeticException | NullPointerException e) {
			//ArithmeticException 예외객체와
			//NullPointerException 예외객체 발생 상황 모두 처리
			e.printStackTrace();
		}
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
