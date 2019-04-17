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
		System.out.println("Main ������ ����");
		
		Ex05_priority th1 = new Ex05_priority(1);
		Ex05_priority th2 = new Ex05_priority(2);
		Ex05_priority th3 = new Ex05_priority(3);
		
		//���μ��� �����ٸ�
		//ThreadŬ������
		//�켱���� ����� Round Robin�����
		//�̿��Ͽ� ������ �����ٸ��� �Ѵ�
		
		//�켱���� : �켱���� ���� �����带 
		//�켱������ �����Ѵ�
		
		//Round Robin : �����ѽð�(time slice) ���� �����ư��鼭 �����带 �����Ѵ�
		
		//������ �켱���� ����
		
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
		
		System.out.println("\nMain ������ ��");
	}
}
