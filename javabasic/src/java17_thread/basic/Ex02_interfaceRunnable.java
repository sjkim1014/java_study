package java17_thread.basic;

class ThreadTest02 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Thread : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}		
	}
}

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {
		ThreadTest02 tt = new ThreadTest02();
		
		Thread thread = new Thread(tt);
		
		thread.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("Main : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
