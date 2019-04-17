package java17_thread.basic;

import java.util.Random;

public class Ex03_test extends Thread{
	private int idx;	//스레드 인덱스
	
	public Ex03_test(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+"스레드 시작");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+"스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		for(int i=0; i<10; i++) {
			new Ex03_test(i).start();
		}
		
		System.out.println("Main 스레드 끝");
	}
}
