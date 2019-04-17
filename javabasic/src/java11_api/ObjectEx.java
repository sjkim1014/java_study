package java11_api;

class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "("+x+","+y+")";
//	}
	
	// toString() 자동 재정의 : alt + shift + s,s
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(x ==((Point)obj).x && y==((Point)obj).y) {
			return true;
		}
		return super.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		
		//getClass() : 클래스 정보 반환
		System.out.println("--------getClass()---------");
		String str = "Apple";
		System.out.println(str.getClass());
		
		System.out.println("--------toString()---------");
		// toString()
		// 기능 : 객체에 대한 설명을 String으로 반환
		// 반환 : 레퍼런스를 문자열로 반환
		// 		(데이터타입@참조)
		// 오버라이딩 가능
		
		//System.out.println() 메소드에 객체를 전달인자로
		//사용하면 toString() 호출 결과를 출력한다		
		
		Object o = new Object();
		System.out.println("o : " + o);
		System.out.println("o.toString() : "+o.toString());
		
		Point p = new Point(10,20);
		System.out.println(p);
		
		System.out.println("--------equal()---------");
		Point p2 = new Point(11,22);
		Point p3 = new Point(11,22);
		
		//참조값 비교
		System.out.println("p2==p3 : " + (p2==p3));		
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		
		System.out.println("-------");
		String str2 = new String("Apple");
//		String str2 = null;
		System.out.println("문자열 동등비교 : " +"Apple".equals(str2));
		System.out.println("문자열 동일비교 : " +("Apple"==str2));
		
		System.out.println("--------hashcode()---------");
		System.out.println(p2);
		System.out.println(p2.hashCode());
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		String s5 = "Apple";
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		System.out.println("s5 : " + s4.hashCode());
		
		//문자열 객체의 hashcode는 생성할 때
		//사용한 문자열상수를 따라가지만
		//생성한 객체와 상수는 동일하지 않다
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		
		System.out.println("-----------clone()---------");
		Point ori = new Point(33,44);
		//얕은 복사
		Point clone1 = ori;
		//생성자를 통한 깊은 복사
		Point clone2 = new Point ( ori.x, ori.y);
		
		//clone()을 통한 깊은 복사
		Point clone3 = null;
		try {
			clone3 = (Point)ori.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(clone3);
		
		
		
	}
}
