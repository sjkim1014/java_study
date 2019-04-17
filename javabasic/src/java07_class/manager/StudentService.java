package java07_class.manager;

import java.util.Scanner;

public class StudentService {
	private Student stu = new Student();
	Scanner sc= new Scanner(System.in);
	
	public StudentService() {
	
	}
	
	public void insertInfo() {
		System.out.println("++기본 정보 입력++");
		System.out.print("이름을 입력하세요 : ");
		stu.setName(sc.nextLine());
		System.out.print("나이를 입력하세요 : ");
		stu.setAge(sc.nextInt());
	}
	
	public void insertScore() {
		System.out.println("++3과목 점수 입력++");
		System.out.print("국어 점수 입력 : ");
		stu.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		stu.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
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
		System.out.println("++ 출력 ++");
		System.out.println("이름 : "+stu.getName());
		System.out.println("나이 : "+stu.getAge());
		System.out.println("Kor : "+stu.getKor());
		System.out.println("Eng : "+stu.getEng());
		System.out.println("Math : "+stu.getMath());		
		System.out.println("총점 : "+stu.getSum());		
		System.out.printf("평균 : %.2f",stu.getAvg());
	}
}
