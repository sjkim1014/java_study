package java14_exception;

public class ExceptionEx_04_Try {
	public static void main(String[] args) {
		try {
			//try 블록
			//예외가 발생하는 코드
			//예외 발생이 예측되는 코드
		}catch( ArithmeticException e ) {
			//ArithmeticException 예외 처리 코드
			System.out.println("산술 연산 실패");
		}catch(NullPointerException e) {
			//NullPointerExcepiton 예외처리코드
			System.out.println("NULL 참조");
		}catch(Exception e) {
			//위 catch구문에서 처리가 되지않는
			// 나머지 모든 예외를 처리하는코드
			System.out.println("나머지 모든 예외 처리");
		}finally {
			// 사용하지 않아도 되는 블록
			
			// 예외가 발생해도
			// 예외가 발생하지 않아도
			// 무조건 수행하는 코드
			
			//자원해제코드
		}
		System.out.println("+ + + 프로그램 종료 + + +");
	}
}
