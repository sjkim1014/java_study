package java05_control.forEx;

public class ForEx_06 {
	public static void main(String[] args) {
		
		//첫날에 10원을 예금하고
		//다음날에는 전날의 2배를
		//예금하는 방식으로
		//보름(15일)동안 저축한 금액은?
		//->327670
		int sum=10; // 증가하는금액
		int total=0; //잔고
		int i; //날짜 
		
		for(i=1; i<=15; i++) {					
			total += sum;	
			sum = sum*2;	
		}
		System.out.println(total);
		
		//반복횟수 : 15
		//반복구간 : 1~15
		
		//초기식 : i=1
		//조건식 : i<=15
		//증감식 : i++
	}
}
