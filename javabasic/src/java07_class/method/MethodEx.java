package java07_class.method;

public class MethodEx {
	public static void main(String[] args) {
		
//		Method_01 m01 = new Method_01();		
//		int result = m01.add(10, 20);		
//		System.out.println(result);
		
		Method_02 m02 = new Method_02(); //��ü����
		m02.method01();
		System.out.println("---------");
		int argument = 100;
		m02.method02(argument);	//argument : ��������, �μ�
		System.out.println("---------");
		m02.printNum2(11,22);
		System.out.println("---------");
		System.out.println("���ϰ� : "+m02.returnNum());
		System.out.println("---------");
		System.out.println(m02.add(100, 200));
		System.out.println(m02.add(200, 300));
		
		
	}
}
