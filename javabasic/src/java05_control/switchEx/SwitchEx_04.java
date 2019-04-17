package java05_control.switchEx;

public class SwitchEx_04 {
	public static void main(String[] args) {
		
		int score=88;
		
		char grade;
		
		switch(score/10) {
		case 10:
			grade='A';
			System.out.println(grade);
			break;			
		case 9:
			grade='A';
			System.out.println(grade);
			break;
		case 8:
			grade='B';
			System.out.println(grade);
			break;
		case 7:
			grade='C';
			System.out.println(grade);
			break;
		case 6:
			grade='D';
			System.out.println(grade);
			break;
		default:
			grade='F';
			System.out.println(grade);
			
		}
		
	}
}
