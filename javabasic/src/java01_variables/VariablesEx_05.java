package java01_variables;

public class VariablesEx_05 {
	public static void main(String[] args) {
		//String 타입
		//참조형타입
		//문자열을 다를수있게해주는 클래스타입
		//거의기본형처럼 사용됨
		
		String name;
		name = "Alice 가나다";
		
		System.out.println(name);
		
		//+기호(연산자)를 이용한 데이터 연결
		
		int age = 22;
		System.out.println("나이 : "+age);
		//System.out.println("나이 : "+22);
		//System.out.println("나이 : 22");
		
		System.out.println("---------------------");
		String fruit;
		int price;
		int num;
		
		//변수에 알맞은값 대입
		
		//최종출력
		
		//ex) 포도, 5000원, 3개
		
		fruit = "포도";
		price = 5000;
		num = 3;
		
		System.out.println(fruit + ", " + price + "원, " + num + "개");
		
		
	}
}
