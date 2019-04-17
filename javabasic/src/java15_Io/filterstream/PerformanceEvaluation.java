package java15_Io.filterstream;

public class PerformanceEvaluation {
	public static void main(String[] args) {
		//성능평가
		// 작업수행시간
		// 시작시간 변수 생성 - start
		// [수행로직]
		// 종료시간 변수 생성 - end
		
		// -> 수행시간 = end - start
		
		//long System.currentTimeMillis();
		//현재시간을 밀리초로 반환
		long start = System.currentTimeMillis();	//시작시간
		for(int i=0; i<1000; i++) {					//성능평가 대상 로직
			System.out.println(i);
		}
		long end = System.currentTimeMillis();		//종료시간
		
		long time = end - start;
		
		System.out.println("[수행시간] : "+(time)/(double)1000);
		
	}
}
