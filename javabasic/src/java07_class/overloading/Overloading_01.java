package java07_class.overloading;

public class Overloading_01 {
	private int x;
	private int y;
	
	public void display() {
		System.out.println("("+x+","+y+")");
	}
	
	public void display(double x) {
		System.out.println("("+x+","+y+")");
	}
	
	//int�� 2���� ���޹޾� x,y�� �ʱ�ȭ �� ���
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		display();	// == this.display();
	}
}
