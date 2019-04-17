package java10_innerClass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface Anonymous{
	void out();
}



public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous an1;
		
		an1 = new Anonymous() {			
			@Override
			public void out() {
				// TODO Auto-generated method stub
				System.out.println("�͸� ��ü 1��");
			}
		};
		
		an1.out();
		
		Anonymous an2;
		an2 = new Anonymous() {
			
			@Override
			public void out() {
				// TODO Auto-generated method stub
				System.out.println("�͸� ��ü 2��");
			}
		};
		
		an2.out();
		
		new Anonymous() {
			@Override
			public void out() {
				// TODO Auto-generated method stub
				System.out.println("�͸�ü 3��");
			}
		}.out();
		
		class A{
			public void out() {
				
			}
		}
		new A().out();
		
		abstract class B{
			public void out() {
				System.out.println("B OUt");
			}
			public abstract void print();
		}
		
		B b = new B() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("B print");
			}
		};
		
		b.out();
		b.print();
	}
}
