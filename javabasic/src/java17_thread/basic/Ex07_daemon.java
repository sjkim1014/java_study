package java17_thread.basic;

class DaemonThread implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			//주기적으로 반복하는 코드
			System.out.println("Auto save");
		}		
	}
}

public class Ex07_daemon{
	public static void main(String[] args) {
		System.out.println("---------main Start-------------");
		
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);//데몬스레드 설정
		thread.start();//스레드활성화
		
		//메인 스레드에 충분한 작업시간 부여
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		System.out.println("---------main End---------------");
	}
}
