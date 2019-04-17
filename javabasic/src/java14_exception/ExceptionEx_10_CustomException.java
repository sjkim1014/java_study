package java14_exception;

//-------------------
//class EvenException
//extends Exception
//-------------------
//
//<override>
//+getMessage() : String
//
//---------------------
//class CheckEven
//+check(int):void
//throws EvenException
//----------------------
class EvenException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "홀수입력 !!";
	}
}

class CheckEven{	
	public void check(int c) throws EvenException{
		if(c%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			throw new EvenException();
		}
	}
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {
		
		CheckEven ce = new CheckEven();
		try {
			ce.check(13);	//예외상황(홀수입력함)
		}catch(EvenException e) {
			e.printStackTrace();
		}
		//"홀수입력 !! " - 예외메세지 출력
				
		try {
			ce.check(12);
		}catch(EvenException e) {
			e.printStackTrace();
		}
		//"짝수입니다~~~" - 출력
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
