package java07_class.basic;

//�Ϲ� Ŭ���� ����
public class MainClass_03 {
	public static void main(String[] args) {
		ClassEx_03 num = new ClassEx_03();
		
//		System.out.println(num.num1); //private
		System.out.println(num.getNum1());
		System.out.println(num.num2); //default
	    System.out.println(num.num3); //protected
		System.out.println(num.num4); //public
	}	
}
	