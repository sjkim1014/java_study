package java10_innerClass;

public class Outer {
	
	//-----------------------------------------------------
	public int num = 10;	//�ν��Ͻ�����
	
	public class MemberInner{	//��� ��ø Ŭ����
		public int num = 20;	//�ν��Ͻ� ����
		
		public void print() {
			System.out.println("��� ��ø Ŭ����");
		}
	}
	//-----------------------------------------------------
	
	public static int staticNum = 30;	//���� ����, static ����
	
	public static class StaticInner{	//���� ��ø Ŭ����
		
		public static int num = 40;
		
		public static void out() {
			System.out.println("���� ��ø Ŭ����");
		}
		
	}
	
	//-----------------------------------------------------
	
	public void out() {	//����޼ҵ�
		int localNum = 50;	//��������
		
		class LocalInner{	//���� ��ø Ŭ����
			public int num = 70;	//��� �ʵ�
			
			public void out() {
				System.out.println("���� ��ø Ŭ����");
			}
		}
		
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
	}
	
	
}
