package java17_thread.basic;

import java.util.Random;

public class Ex04_join extends Thread{
	private int idx;	//스레드 인덱스
	
	public Ex04_join(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+"스레드 시작");
		
		Random ran = new Random();
		try {// 임의의 작업시간 부여하기
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+"스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		for(int i=0; i<10; i++) {
			Thread th = new Ex04_join(i);
			th.start();
			
			try {
				//다른 스레드의 종료 기다리기
				//메인스레드가 다른 스레드들의 종료를 모두 기다리게 된다
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main 스레드 끝");
	}
}
