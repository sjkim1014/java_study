package java04_operator;

public class BinaryEx_01 {
	public static void main(String[] args){
		// 이항연산자 - 산술
		// + - * / %
		
		int num1=17, num2=4, result;
		
		result = num1+num2;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.println("----------");
		//int와 int연산에서 결과를 double로 보려면 형변환 필요
		System.out.println((double)num1/num2);
		System.out.println();
		System.out.println("----------");
		
		double d = 3.14;
		System.out.println("d/2 = "+d/2);
		
		System.out.println("-----");
		System.out.println("d%2 = "+d%2);
		//결과값의 소수점 00000001 은 실수형의 오차
		//컴퓨터에서 어쩔수없이 발생한다. 무시하세요
		
		//이항연산은 항상 피연산자들의 데이터타입이 일치해야한다
		//이항연산의 결과는 피연산자의 데이터타입과 동일
		
	}

}
