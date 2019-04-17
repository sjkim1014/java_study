package java17_thread.basic;

import java.util.Random;

public class Ex03_test extends Thread{
	private int idx;	//������ �ε���
	
	public Ex03_test(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+"������ ����");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+"������ ��");
	}
	
	public static void main(String[] args) {
		System.out.println("Main ������ ����");
		
		for(int i=0; i<10; i++) {
			new Ex03_test(i).start();
		}
		
		System.out.println("Main ������ ��");
	}
}
