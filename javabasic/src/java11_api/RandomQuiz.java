package java11_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {
		//가위바위보 게임 만들기
		//int user : 사용자 입력 (1~3)
		//int com : 컴퓨터 랜덤(1~3)
		
		//1: 가위, 2: 바위, 3 : 보
		
		//1.Random을 이용하여 com에 값 저장
			// com값 출력
		//2.user에 입력받기
		//3.com, user 비교 ( 가위바위보 승부)
		//4.결과 출력 (승자)
		
		//5. 1~4 반복
		
		int user,com;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			com = ran.nextInt(3)+1;
			System.out.println("com : "+com);
			System.out.print("사용자 입력 : ");
			user = sc.nextInt();
			
			if(user>3 || user<1) {
				System.out.println("다시입력하세요");
				continue;
			}else{
				if(com==1) {
					if(user==1) {
						System.out.println("컴퓨터 : (가위) "+com+" 사용자 : (가위) "+user+", 비겼습니다.");
					}
					if(user==2) {
						System.out.println("컴퓨터 : (가위) "+com+" 사용자 : (바위) "+user+", 사용자 승");
					}
					if(user==3) {
						System.out.println("컴퓨터 : (가위) "+com+" 사용자 : (보) "+user+", 컴퓨터 승");
					}				
				}
				if(com==2) {
					if(user==1) {
						System.out.println("컴퓨터 : (바위) "+com+" 사용자 : (가위) "+user+", 컴퓨터 승");
					}if(user==2) {
						System.out.println("컴퓨터 : (바위) "+com+" 사용자 : (바위) "+user+", 비겼습니다");
					}if(user==3) {
						System.out.println("컴퓨터 : (바위) "+com+" 사용자 : (보) "+user+", 사용자 승");
					}
					
				}
				if(com==3) {
					if(user==1) {
						System.out.println("컴퓨터 : (보) "+com+" 사용자 : (가위) "+user+", 사용자 승");
					}
					if(user==2) {
						System.out.println("컴퓨터 : (보) "+com+" 사용자 : (바위) "+user+", 컴퓨터 승");
					}
					if(user==3) {
						System.out.println("컴퓨터 : (보) "+com+" 사용자 : (보) "+user+", 비겼습니다.");
					}					
				}
			}
			
		}
	}
}
