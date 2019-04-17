package java17_thread.basic;

class DaemonThread implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			//�ֱ������� �ݺ��ϴ� �ڵ�
			System.out.println("Auto save");
		}		
	}
}

public class Ex07_daemon{
	public static void main(String[] args) {
		System.out.println("---------main Start-------------");
		
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);//���󽺷��� ����
		thread.start();//������Ȱ��ȭ
		
		//���� �����忡 ����� �۾��ð� �ο�
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		System.out.println("---------main End---------------");
	}
}
