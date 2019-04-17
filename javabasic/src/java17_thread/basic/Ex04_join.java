package java17_thread.basic;

import java.util.Random;

public class Ex04_join extends Thread{
	private int idx;	//������ �ε���
	
	public Ex04_join(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+"������ ����");
		
		Random ran = new Random();
		try {// ������ �۾��ð� �ο��ϱ�
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+"������ ��");
	}
	
	public static void main(String[] args) {
		System.out.println("Main ������ ����");
		
		for(int i=0; i<10; i++) {
			Thread th = new Ex04_join(i);
			th.start();
			
			try {
				//�ٸ� �������� ���� ��ٸ���
				//���ν����尡 �ٸ� ��������� ���Ḧ ��� ��ٸ��� �ȴ�
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main ������ ��");
	}
}
