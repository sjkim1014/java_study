package java14_exception;

import java.io.IOException;

class ThrowsEx{
	public char readChar() throws IOException {
		//�Է¹��� ������ �ƽ�Ű�ڵ带 ��ȯ�Ѵ�
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
		System.out.println("�Է��� ���� : "+ch);
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
