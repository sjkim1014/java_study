package java14_exception;

public class ExceptionEx_06_throw {
	public static void main(String[] args) {
	
			
		// 무조건 예외가 발생함
//		throw new NullPointerException();
		
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("널 포인터 참조 예외 발생");
		}catch(Exception e) {
			System.out.println("모든 예외 처리");
		}finally {
			System.out.println("무조건 실행되는 코드");
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
