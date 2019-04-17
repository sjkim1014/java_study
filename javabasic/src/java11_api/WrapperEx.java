package java11_api;

import java.util.Random;

public class WrapperEx {
	public static void main(String[] args) {
		int i1 = 10;
		Integer iVal1 = new Integer(i1);	//�ڽ�, Boxing
		Integer iVal2 = new Integer("123");	
		Integer iVal3 = new Integer(555);
		
		System.out.println(iVal1);
		System.out.println(iVal1+22);
		
		System.out.println("----------");
		double d1 = 123.456;
		Double dVal1 = new Double(d1);//�ڽ�
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
		Integer iVal4 = 20;		//����ڽ�
		Double dVal3 = 555.3526;//����ڽ�
		
		System.out.println("----------");
		int i4 = iVal4;		//�����ڽ�
		double d3 = dVal3;	//�����ڽ�
		
		System.out.println("----------");
		out("Apple");
		out(123);
		//int -> Integer : ����ڽ�
		//Integer -> Object : �ڵ�����ȯ, �θ�Ÿ��
		
	}
	
	
	
	
	public static void out(Object obj) {
		System.out.println("obj : "+obj);
		//println()�� ��ü�� ���޵Ǹ� toString() ȣ��
		//Object.toString()
		//	-> �������ε�, Integer.toString()
		//Integer.toString()�� �⺻������Ÿ���� ��ȯ
	}
}
