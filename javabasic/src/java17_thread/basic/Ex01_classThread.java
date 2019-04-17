package java17_thread.basic;

class ThreadTest01 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("ThreadTest : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}	
	}
}

public class Ex01_classThread {
	public static void main(String[] args) {
		ThreadTest01 tt = new ThreadTest01();
		tt.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("Main : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
