package java09_abstract.quiz;

public class Taxi implements Fare {

	@Override
	public void calc(int distance) {
		// TODO Auto-generated method stub
		System.out.println(distance+"m �� �������� �� ����� "+(distance*FEE*2)+"�� �Դϴ�");
	}
	
}
