package java17_thread.synchronize;

class Sync01 extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.println(i+"값 더하기");
		}
	}
}

public class SyncEx_01 {
	public static void main(String[] args) {
		Sync01 sync = new Sync01();		
		sync.start(); //멤버필드 total에 1~100덧셈 구하기
		
		//다른 스레드의 동작완료를 기다리는 메소드 join()을 이용한 동기화 처리
		try {
//			Thread.sleep(5000);
			sync.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//동기화 되지 않으면 덧셈 이전에 결과를 출력해버림
		System.out.println("1~100의 합 : " + sync.total);
	}
}
