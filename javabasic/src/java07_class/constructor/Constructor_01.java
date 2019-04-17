package java07_class.constructor;

import java.util.Scanner;

public class Constructor_01 {
	private int num1;
	private int num2 = 200;
	
	private Scanner sc;	//입력객체
	
	//생성자
	public Constructor_01() {
		//아무런 동작도 하지 않는다
		sc = new Scanner(System.in);
		num1 = 100; 
		num2 = 300;	//멤버필드 초기화 이후 동작함
	}
	
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void Constructor_01() {
		//일반메소드, 생성자아님(반환타입이 잇기때문에, 오버로딩도아님)
		System.out.println("일반생성자입니다.");
		System.out.println("생성자 아니에요!");
	}
	
	public void out() {
	
		System.out.println("("+num1+","+num2+")");
	}
	
}
