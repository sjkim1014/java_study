package java14_exception;

class ThrowEx{
	public void print(String str, int cnt) {
		//문자열이 null 이면 NullPointerException 발생 시키기
		if(str == null) {
			throw new NullPointerException();
//			System.out.println("null 값 출력 불가");
//			return;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
}

public class ExceptionEx_07_throw {
	public static void main(String[] args) {
		ThrowEx th = new ThrowEx();
		
		String str = null;
		
		try {
			th.print(str, 3);
		}catch(NullPointerException e){
			System.out.println("[WARN] 문자열ㄹ null입력됨");
		}
		
		
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
