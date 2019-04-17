package java05_control.etc;

public class BreakContinueEx {
	public static void main(String[] args) {
		//break
		//제어문을 중단시키는 코드
		//if는 중단시키지 않는다
		// 가까운 블럭을 제어하는 제어문 한개만 중단
		
		for(int i=0; true; i++) {
			System.out.println(i);
			if(i>=5) {
				break;
			}
		}
		
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {	//i, 0~4
			
			for(int j=0; j<5; j++) {	//j, 0~4
				System.out.println(i+" , "+j);
				
				if(j==2) {
					break;
				}
			}
			
		}
		System.out.println("---------------");		
		//continue
		//반복문을 다음 반복으로 넘긴다
		// for loop->증감문을 ㅗ보냄
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {	//짝수일경우
				continue;
			}
			System.out.println(i);
		}
	}
}
