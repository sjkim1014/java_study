package java05_control.doWhileEx;

public class DoWhileEx_01 {
	public static void main(String[] args) {
		//do-while loop
		//while문의 변형		
		
//		do{
//			//반복코드
//		}while(조건식);
//		
		
		do {
			System.out.println("출력이되려나");
		}while(false);
		
		//do-while문은 최초 1회는 무조건 반복코드 수행
		//그이후 조건검사하면서 반복제어
		
		System.out.println("---------");
		
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
	}
}
