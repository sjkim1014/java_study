package java09_abstract.quiz;

public class Taxi implements Fare {

	@Override
	public void calc(int distance) {
		// TODO Auto-generated method stub
		System.out.println(distance+"m 를 운행했을 때 요금은 "+(distance*FEE*2)+"원 입니다");
	}
	
}
