package java05_control.switchEx;

public class SwitchEx_03 {
	public static void main(String[] args) {
		
		int num=2;
		switch(num*10) {
		case 10:
			System.out.println("값은 10");
			break;
		case 20:
			System.out.println("값은 20");
			break;
		case 30:
			System.out.println("값은 30");
			break;
		default:
			System.out.println("적절한값없음");
		}
		
	}
}
