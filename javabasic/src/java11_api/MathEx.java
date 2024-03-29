package java11_api;

import java.util.Date;

public class MathEx {
	public static void main(String[] args) {
		//-10의 절대값
		//3.7의 올림값
		//3.7의 내림값
		//2.1의 3제곱값
		//0.0(포함) ~ 1.0(제외) 사이의 난수 (랜덤)
		//자연상수 e의 3.3제곱
		//-3.7의 올림값
		//-3.7의 내림값
		
		System.out.println(new Date().getTime());
		System.out.println(Math.abs(-10)); // 절대값 Math.abs();
		System.out.println(Math.ceil(3.7));	//올림값  Math.ceil();
		System.out.println(Math.floor(3.7));	//내림값  Math.floor();
		System.out.println(Math.pow(2.1, 3)); //제곱값 Math.pow(값,제곱할값);
		System.out.println(Math.random());	// 난수 Math.random();
		System.out.println(Math.exp(3.3)); //자연상수 e : Math.E
		System.out.println(Math.ceil(-3.7));	//올림값
		System.out.println(Math.floor(-3.7));	//내림값
		
	}
}
