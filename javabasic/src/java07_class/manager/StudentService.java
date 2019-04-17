package java07_class.manager;

import java.util.Scanner;

public class StudentService {
	private Student stu = new Student();
	Scanner sc= new Scanner(System.in);
	
	public StudentService() {
	
	}
	
	public void insertInfo() {
		System.out.println("++�⺻ ���� �Է�++");
		System.out.print("�̸��� �Է��ϼ��� : ");
		stu.setName(sc.nextLine());
		System.out.print("���̸� �Է��ϼ��� : ");
		stu.setAge(sc.nextInt());
	}
	
	public void insertScore() {
		System.out.println("++3���� ���� �Է�++");
		System.out.print("���� ���� �Է� : ");
		stu.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		stu.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		stu.setMath(sc.nextInt());
		calcSum();
		calcAvg();
	}
	
	private void calcSum() {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());	
	}
	
	private void calcAvg() {	
		stu.setAvg((stu.getSum()/3.0));
	}
	
	public void printStu() {
		System.out.println("++ ��� ++");
		System.out.println("�̸� : "+stu.getName());
		System.out.println("���� : "+stu.getAge());
		System.out.println("Kor : "+stu.getKor());
		System.out.println("Eng : "+stu.getEng());
		System.out.println("Math : "+stu.getMath());		
		System.out.println("���� : "+stu.getSum());		
		System.out.printf("��� : %.2f",stu.getAvg());
	}
}
