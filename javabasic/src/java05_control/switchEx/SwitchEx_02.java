package java05_control.switchEx;

public class SwitchEx_02 {
	public static void main(String[] args) {
		
		char ch='q';
		
		switch(ch) {
		case 'Q':
			System.out.println("대문자 큐");
			break;
		
		case 'q':
			System.out.println("소문자 큐");
			break;
		
		case 'a':
			System.out.println("에이");
			break;
		
		case 'b':
			System.out.println("비");
			break;
		}
		
	}
}
