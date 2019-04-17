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
		return "Ȧ���Է� !!";
	}
}

class CheckEven{	
	public void check(int c) throws EvenException{
		if(c%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			throw new EvenException();
		}
	}
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {
		
		CheckEven ce = new CheckEven();
		try {
			ce.check(13);	//���ܻ�Ȳ(Ȧ���Է���)
		}catch(EvenException e) {
			e.printStackTrace();
		}
		//"Ȧ���Է� !! " - ���ܸ޼��� ���
				
		try {
			ce.check(12);
		}catch(EvenException e) {
			e.printStackTrace();
		}
		//"¦���Դϴ�~~~" - ���
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
