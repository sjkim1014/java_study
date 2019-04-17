package java05_control.forEx;

public class ForEx_08 {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("i:"+i+",j:"+j);
			}
			System.out.println();
		}
		
		//반복문 중첩시 고려사항
		//바깥쪽 loop의 반복자의 진행과
		//안쪽 loop의 반복자의 진행의 관계를 잘 파악해야함
		
		// i : iterate
	}
}
