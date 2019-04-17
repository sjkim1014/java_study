package java07_class.basic;
//일반 클래스 정의
public class MainClass_01 {
	public static void main(String[] args) {
		ClassEx_01 ce01 = new ClassEx_01();
		ClassEx_01 ce02 = new ClassEx_01();
		ClassEx_01 ce03 = new ClassEx_01();
		
		ce01.num=1;
		ce01.str="ㅇㅇㅇ";
		ce02.num=2;
		ce02.str="ㅁㄴㅇ";
		ce03.num=3;
		ce03.str="ㅂㅈㄷㄱ";
		
		ce01.display();
		ce02.display();
		ce03.display();
	}
}
	