package java01_variables;	//소스코드가 포함된 패키지 선언

/*
 * 변수테스트 01
 * */

public class VariablesEx_01 {	//클래스정의
	
	//메인 메소드 - 프로그램의 시작점
	public static void main(String[] args) {	
		//메인 메소드의 코드영역(실행영역)
		//여기 내부에 있는 코드가 프로그램으로 작동함
		
		//모니터 (콘솔창)에 문장을 출력하는 명령
//		System.out.println("메인메소드 동작 테스트");
		// 주석단축키 컨트롤 쉬프트 C
		
		int num; //int형 변수 num 선언
		//메모리에 4B 공간을 확보하고, 정수값을 넣을수 있게 준비
		
		num = 123; //num 변수에 123 대입
		//메모리의 num 변수 공간에 123 저장
		
		System.out.println(num);
		//num 출력
		System.out.println(num+111);
		//num + 111 한값을 출력
		num = 55;
		
		System.out.println(num);
		
	}//메인메소드의 끝(프로그램의 종료점)
	
}//클래스의 정의의 끝

