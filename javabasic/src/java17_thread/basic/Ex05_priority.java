package java17_thread.basic;

public class Ex05_priority extends Thread{
	private int idx;
	
	public Ex05_priority(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print(idx);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		Ex05_priority th1 = new Ex05_priority(1);
		Ex05_priority th2 = new Ex05_priority(2);
		Ex05_priority th3 = new Ex05_priority(3);
		
		//프로세스 스케줄링
		//Thread클래스는
		//우선순위 기법과 Round Robin기법을
		//이용하여 스레드 스케줄링을 한다
		
		//우선순위 : 우선순위 높은 스레드를 
		//우선적으로 수행한다
		
		//Round Robin : 적절한시간(time slice) 동안 번갈아가면서 스레드를 수행한다
		
		//스레드 우선순위 설정
		
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {}
		
		System.out.println("\nMain 스레드 끝");
	}
}
