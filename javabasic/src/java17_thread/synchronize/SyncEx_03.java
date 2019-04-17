package java17_thread.synchronize;

class SyncData{
	int total;
	
	boolean available = false;
	//total�� ���� ����� ����Ǿ������� ���� ���� flag
	// false - ������ �Ϸ���� ����
	// true - ������ �Ϸ�Ǿ���
}

class Input extends Thread{
	SyncData data;
	public Input(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {	//1~100 ���� ��� ������
		System.out.println("----input Start----");
		synchronized (data) {
			for(int i=1; i<=100; i++) {
				data.total += i;
			}
			data.available=true; //����Ϸ� flag����
			data.notifyAll();	//�Ӱ迵�� �۾��Ϸ� ����
		}
		System.out.println("----input End----");
	}
}

class Output extends Thread{
	SyncData data;
	public Output(SyncData data) {
		this.data = data;		
	}
	@Override
	public void run() {	//��������� ������
		System.out.println("----output Start----");
		synchronized (data) {	//�Ӱ迵��	
			//���� ����� �Ϸ���� ������ wait() ����
			while(data.available == false) {
				try {
					data.wait();
				}catch (InterruptedException e) {}		
			}
			System.out.println("TOTAL : " + data.total);
		}		
		System.out.println("----output End----");
	}
}

public class SyncEx_03 {
	public static void main(String[] args) {
		SyncData data = new SyncData();
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
	}
}
