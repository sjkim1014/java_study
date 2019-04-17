package java14_exception;

import java.io.IOException;

class ThrowsEx{
	public char readChar() throws IOException {
		//입력받은 문자의 아스키코드를 반환한다
		return (char) System.in.read();
		
	}
}

public class ExceptionEx_08_throw {
	public static void main(String[] args) {
		
		ThrowsEx te = new ThrowsEx();
		
		System.out.print("input : ");
		char ch='\0';
		try {
			ch=te.readChar();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력한 문자 : "+ch);
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
