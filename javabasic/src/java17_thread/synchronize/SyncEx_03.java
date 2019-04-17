package java17_thread.synchronize;

class SyncData{
	int total;
	
	boolean available = false;
	//total에 값이 제대로 저장되었는지에 대한 상태 flag
	// false - 연산이 완료되지 않음
	// true - 연산이 완료되었음
}

class Input extends Thread{
	SyncData data;
	public Input(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {	//1~100 덧셈 계산 스레드
		System.out.println("----input Start----");
		synchronized (data) {
			for(int i=1; i<=100; i++) {
				data.total += i;
			}
			data.available=true; //연산완료 flag설정
			data.notifyAll();	//임계영역 작업완료 통지
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
	public void run() {	//데이터출력 스레드
		System.out.println("----output Start----");
		synchronized (data) {	//임계영역	
			//덧셈 결과가 완료되지 않으면 wait() 빠짐
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
