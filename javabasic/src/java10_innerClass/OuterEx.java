package java10_innerClass;

import java10_innerClass.Outer.MemberInner;

public class OuterEx {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		System.out.println(o.num);	//OuterŬ������ ����ʵ�
		System.out.println("----------");
		
		Outer.MemberInner memIn;
		memIn = o.new MemberInner();

		System.out.println(memIn.num);
		memIn.print();
		
		System.out.println("----------");
		
		System.out.println(Outer.staticNum);
		System.out.println(Outer.StaticInner.num);
		Outer.StaticInner.out();
		
		System.out.println("----------");
		
		o.out();		// ������øŬ����, �ܺο��� ���� �Ұ�
		
		
	}
}
