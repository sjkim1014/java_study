package java04_operator;

//단항연산자
//Unary Operator

public class UnaryEx_02 {
	public static void main(String[] args) {
		// 단항연산자 - 증감
		// ++ --
		
		//변수의 값을 1증가시키거나 1 감소시킨다
		//증감된 값은 변수에 저장된다
		
		//피연산자의 앞 또는 뒤에 올수있다.
		
		int num=15;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		
		int num2=15;
		System.out.println("--");
		System.out.println(num2);
		System.out.println(++num2);
		System.out.println(num2);
		
		int n = 13;
		
		n = n+1;
		n +=1;
		n++;
		
		
		
	}
}
