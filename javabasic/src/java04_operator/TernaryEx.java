package java04_operator;

public class TernaryEx {
	public static void main(String[] args) {
		//삼항조건연산자
		// 조건 ?참 :거짓
		
		//조건을 검사해서 참이면 ? 뒤 항목을 결과로 내보냄
		//거짓이면 : 뒤 항목을 결과로 내보냄
		
		//조건은 true/false 판별가능해야함
		
		System.out.println(true ? "참" : "거짓");
		System.out.println(false ? "참" : "거짓");
		
		int num1=10,num2=20;
		
		System.out.println((num1>num2) ? "num1이 큼" : "num2가 큼");
	}
}
