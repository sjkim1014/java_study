package java05_control.forEx;

public class ForEx_03 {
	public static void main(String[] args) {

		for(int num=10; num>=1; num--) {
			System.out.println(num);
			
//			반복횟수 : 10번 
//			반복구간 : 10-1;
		}
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		//반복횟수 : 5 
		//반복구간 : 0 2 4 6 8 5회 0+=2
		
		for(int j=0; j<7; j++) {
			System.out.println("hello");
		}
	}
}
