package java17_thread.basic;

class Thread06 extends Thread{
	@Override
	public void run() {
		method01();
	}
	
	public void method01() {
		method02();
	}
	
	public void method02() {
		method03();
	}
	
	public void method03() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Ex06_stacktrace{
	public static void main(String[] args) {
		new Thread06().start();	//새로운 스레드 생성
		
		new Thread06().method01();	//메인스레드에서 호출
		
	}
}
