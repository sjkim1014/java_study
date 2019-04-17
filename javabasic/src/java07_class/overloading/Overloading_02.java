package java07_class.overloading;

public class Overloading_02 {
	//데이터의 문자수를 구해 반환
	//112233 -> 6 반환
	public int getLength(int num) {
		//int -> String
		// 112233 -> "112233"		
		String str = String.valueOf(num); // int를 string으로 변환시켜주는 함수		
		return str.length();
	}
	
	public int getLength(double num) {	
		String str = String.valueOf(num); 		
		return str.length();
	}
	
	public int getLength(Boolean num) {			
		String str = String.valueOf(num);		
		return str.length();
	}
	
//	반환타입이 바껴도 오버로딩은 안됨	
//	public void getLength(int num) {
//		
//	}
	
	
}
