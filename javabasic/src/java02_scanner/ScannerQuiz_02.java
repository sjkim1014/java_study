package java02_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 데이터입력
		 * 1-1 변수만들기
		 * 이름 나이 성별 국어 영어 수학 
		 * 성별은 스트링으로 처리
		 * 
		 * 1-2 데이터 입력받기
		 * 2. 총점과 평균 계산하기
		 * sum과 avg변수를 만드세요
		 * 
		 * 3.학생 정보 출력
		 * 
		 * 이름 나이 성별 국어 영어 수학 총점 평균
		 * alice 22 여 100 80 56 236 78.67
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		String name,sex;
		int age,ko,ma,eng,sum;
		double avg;
		
		System.out.println("----입력----");
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("성별 : ");
		sc.nextLine();
		sex = sc.nextLine();
		
		System.out.print("국어 : ");
		ko = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 : ");
		ma = sc.nextInt();
		
		sum = ko+eng+ma;
		avg = (double)sum/3;
		
		System.out.println("\n\n---출력---");
		System.out.println("이름\t나이\t성별\t국어\t수학\t영어\t총점\t평균");
		System.out.printf("%s\t%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",name,age,sex,ko,ma,eng,sum,avg);
		System.out.println(name + "\t" + age + "\t" + sex + "\t" + ko + "\t" + ma + "\t" + eng + "\t" + sum +"\t" + avg );
		
			
	}
}
