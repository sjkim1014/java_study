package java17_thread.synchronize;

class Sync01 extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.println(i+"�� ���ϱ�");
		}
	}
}

public class SyncEx_01 {
	public static void main(String[] args) {
		Sync01 sync = new Sync01();		
		sync.start(); //����ʵ� total�� 1~100���� ���ϱ�
		
		//�ٸ� �������� ���ۿϷḦ ��ٸ��� �޼ҵ� join()�� �̿��� ����ȭ ó��
		try {
//			Thread.sleep(5000);
			sync.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����ȭ ���� ������ ���� ������ ����� ����ع���
		System.out.println("1~100�� �� : " + sync.total);
	}
}
