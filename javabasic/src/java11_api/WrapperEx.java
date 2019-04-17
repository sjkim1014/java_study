package java11_api;

import java.util.Random;

public class WrapperEx {
	public static void main(String[] args) {
		int i1 = 10;
		Integer iVal1 = new Integer(i1);	//박싱, Boxing
		Integer iVal2 = new Integer("123");	
		Integer iVal3 = new Integer(555);
		
		System.out.println(iVal1);
		System.out.println(iVal1+22);
		
		System.out.println("----------");
		double d1 = 123.456;
		Double dVal1 = new Double(d1);//박싱
		Double dVal2 = new Double("45.444");
		System.out.println(dVal1);
		System.out.println(dVal2);
		
		System.out.println("-----------");
		int i2 = iVal1.intValue();
		double d2 = dVal1.doubleValue();
		System.out.println(i2);
		System.out.println(d2);
		
		System.out.println("----------");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.BYTES);
		
		System.out.println("----------");
		Integer iVal4 = 20;		//오토박싱
		Double dVal3 = 555.3526;//오토박싱
		
		System.out.println("----------");
		int i4 = iVal4;		//오토언박싱
		double d3 = dVal3;	//오토언박싱
		
		System.out.println("----------");
		out("Apple");
		out(123);
		//int -> Integer : 오토박싱
		//Integer -> Object : 자동형변환, 부모타입
		
	}
	
	
	
	
	public static void out(Object obj) {
		System.out.println("obj : "+obj);
		//println()에 객체가 전달되면 toString() 호출
		//Object.toString()
		//	-> 동적바인딩, Integer.toString()
		//Integer.toString()은 기본데이터타입을 반환
	}
}
