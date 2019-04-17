package java05_control.switchEx;

public class SwitchEx_01 {
	public static void main(String[] args) {
		//switch 문
		/*
		switch(비교대상) { // 주로변수
		
		case 비교값1:
			
		case 비교값2:
			
			...
			
		default:
		
		}
		*/
		
		int num = 10;
		
		switch(num) {
		case 10:
			System.out.println("값은 10");
			break;	//제어문을 중단시킴. 단, if 제외
		case 20:
			System.out.println("값은 20");
			break;
		case 30:
			System.out.println("값은 30");
			break;
		default:
			System.out.println("디폴트.");
			System.out.println("적당한 case값 없음");
		}
		
		/*
		 * if(num==10){
		 * 		
		 * }else if(num==20){
		 * 
		 * }else if(num==30){
		 * 
		 * }else{
		 * 
		 * }
		 * */
	}
}
