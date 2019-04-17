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
	
	// toString() �ڵ� ������ : alt + shift + s,s
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	// equals ������
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
		
		//getClass() : Ŭ���� ���� ��ȯ
		System.out.println("--------getClass()---------");
		String str = "Apple";
		System.out.println(str.getClass());
		
		System.out.println("--------toString()---------");
		// toString()
		// ��� : ��ü�� ���� ������ String���� ��ȯ
		// ��ȯ : ���۷����� ���ڿ��� ��ȯ
		// 		(������Ÿ��@����)
		// �������̵� ����
		
		//System.out.println() �޼ҵ忡 ��ü�� �������ڷ�
		//����ϸ� toString() ȣ�� ����� ����Ѵ�		
		
		Object o = new Object();
		System.out.println("o : " + o);
		System.out.println("o.toString() : "+o.toString());
		
		Point p = new Point(10,20);
		System.out.println(p);
		
		System.out.println("--------equal()---------");
		Point p2 = new Point(11,22);
		Point p3 = new Point(11,22);
		
		//������ ��
		System.out.println("p2==p3 : " + (p2==p3));		
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		
		System.out.println("-------");
		String str2 = new String("Apple");
//		String str2 = null;
		System.out.println("���ڿ� ����� : " +"Apple".equals(str2));
		System.out.println("���ڿ� ���Ϻ� : " +("Apple"==str2));
		
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
		
		//���ڿ� ��ü�� hashcode�� ������ ��
		//����� ���ڿ������ ��������
		//������ ��ü�� ����� �������� �ʴ�
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		
		System.out.println("-----------clone()---------");
		Point ori = new Point(33,44);
		//���� ����
		Point clone1 = ori;
		//�����ڸ� ���� ���� ����
		Point clone2 = new Point ( ori.x, ori.y);
		
		//clone()�� ���� ���� ����
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
