package java09_abstract.interfaceEx;

interface Inter_01{
	public void out();
	
}
interface Inter_02{
	public void out();
}

class Parent{
	public void out() {
		System.out.println("�θ�޼ҵ�");
	}
	
}
class Child extends Parent implements Inter_01,Inter_02{
	
	
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.out();
		
		//extend�� �θ�Ŭ���� Ÿ���� ��ü��
		//�ڽ� Ŭ������ �ν��Ͻ� ���� ����
		Parent p =  new Child(); // �θ� <- �ڽ�
		
		
		//implements��  �θ��������̽� Ÿ���� ��ü��
		//�ڽ�Ŭ������ �ν��Ͻ� ���� ����
		Inter_01 i01 =new Child();	//�θ� <- �ڽ�
		Inter_02 i02 =new Child();	//�θ� <- �ڽ�
		
		i01.out();
		i02.out();
		
		//�������̽��� ��ü���� �Ұ�
//		Inter_01 i03 = new Inter_01(); // �ν��Ͻ�ȭ �Ұ�
	}
}



// �ڹٴ� ���߻���� �����ϰ� �ִ�
// ** ���߻�� : �ϳ��� Ŭ������ �������� Ŭ������ ��� �޴� ��
//
//	class Parent1{
//		public void out() {
//			
//		}
//	}
//	class Parent2{
//		public void out() {
//			
//		}
//	}
//	
//	class child extends Parent1, Parent2{
//		//� out�� ��ӹ޾ƾ��ϴ��� ��ȣ����
//		//-> �ڹٴ� �̷���Ȳ�� �������� ���߻�� ������Ŵ
//	}
































