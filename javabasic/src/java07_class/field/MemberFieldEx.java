package java07_class.field;

public class MemberFieldEx {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		MemberField_01 m01;		//객체변수 선언
		m01 = new MemberField_01();		//객체 생성
		
//		m01.num=200; //private변수 접근불가
		m01.setNum(100);
		MemberField_01 m02 = new MemberField_01();
		m02.setNum(200);
		System.out.println(m01.getNum());
		System.out.println(m02.getNum());
		
		MemberField_01 m03 = new MemberField_01();
		m03.setNum(500);
		System.out.println(m03.getNum());
		
		System.out.println("---------------------");
		MemberField_02 m04 = new MemberField_02();
		MemberField_02 m05 = new MemberField_02();
	
		MemberField_02.setFruit("apple");
		System.out.println(m04.getFruit());
		System.out.println(m05.getFruit());
		System.out.println(MemberField_02.getFruit());
		
		//정적메소드 호출 예시
		Math.min(10, 20);
		System.out.println("---------------------");
		MemberField_03 m06 = new MemberField_03();
		m06.method(50);
		
	}
}
