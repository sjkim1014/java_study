package java17_thread.synchronize;

class Sync02 extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1; i<=100; i++) {
				total += i;
				System.out.println(i+"값 더하기");
			}
			notify();
		}
	}
}

public class SyncEx_02 {
	public static void main(String[] args) {
		Sync02 sync = new Sync02();		
		sync.start(); 
		
		synchronized (sync) {
			try {
				sync.wait();	//LOCK 반납
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("1~100의 합 : " + sync.total);
		}
		
	}
}
