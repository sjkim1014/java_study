package java10_innerClass;

public class Outer {
	
	//-----------------------------------------------------
	public int num = 10;	//인스턴스변수
	
	public class MemberInner{	//멤버 중첩 클래스
		public int num = 20;	//인스턴스 변수
		
		public void print() {
			System.out.println("멤버 중첩 클래스");
		}
	}
	//-----------------------------------------------------
	
	public static int staticNum = 30;	//정적 변수, static 변수
	
	public static class StaticInner{	//정적 중첩 클래스
		
		public static int num = 40;
		
		public static void out() {
			System.out.println("정적 중첩 클래스");
		}
		
	}
	
	//-----------------------------------------------------
	
	public void out() {	//멤버메소드
		int localNum = 50;	//지역변수
		
		class LocalInner{	//지역 중첩 클래스
			public int num = 70;	//멤버 필드
			
			public void out() {
				System.out.println("지역 중첩 클래스");
			}
		}
		
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
	}
	
	
}
