package java02_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 삼각형넓이 구하기
		 * -삼각형 ㄴ넓이 = (밑변 * 높이)/2
		 * -밑변과 높이를 입력받아 계산
		 * 
		 * -ex)
		 * ---입력 ----
		 * 밑변? 9
		 * 높이? 3
		 * 
		 * ---출력---
		 * 넓이 : XX.XX
		 * 
		 * + 추가문제 : 소숫점 둘째자리까지 출력
		 * */
		
		double height,width,sum;
		
		System.out.println("---입력---");
		System.out.print("밑변 : ");
		width = sc.nextDouble();
		System.out.print("높이 : ");
		sc.nextLine();
		height = sc.nextDouble();
		
		System.out.println("---출력---");
		sum = (height * width)/2;
		System.out.println(String.format("넓이 : %,.2f", sum));
		System.out.printf("넓이 : %.2f\n", sum);
		
		
		
		
	}
}
