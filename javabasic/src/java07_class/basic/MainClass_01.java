package java07_class.basic;
//�Ϲ� Ŭ���� ����
public class MainClass_01 {
	public static void main(String[] args) {
		ClassEx_01 ce01 = new ClassEx_01();
		ClassEx_01 ce02 = new ClassEx_01();
		ClassEx_01 ce03 = new ClassEx_01();
		
		ce01.num=1;
		ce01.str="������";
		ce02.num=2;
		ce02.str="������";
		ce03.num=3;
		ce03.str="��������";
		
		ce01.display();
		ce02.display();
		ce03.display();
	}
}
	