package java04_operator;

public class BinaryEx_02 {
	public static void main(String[] args){
		
		//이항연산자 - 대입(Assign)
		//오른쪽에 있는 값을 왼쪽의 공간에 저장
		
		//=기호 오른쪽은 값만와야하고, 왼쪽은 공간만 와야한다
	
		int num1=10, num2=20;
		System.out.println("---연산전---");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		num2+=num1;
		num2-=num1;
		num2*=num1;
		num2/=num1;
		num2%=num1;
		
		System.out.println("---연산후---");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

	}

}
