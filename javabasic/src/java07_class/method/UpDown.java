package java07_class.method;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Random ran = new Random();
		int com = ran.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		int num,count=6;
		
		while(true) {
			System.out.print("1~50 숫자를 입력해주세요 ");
			num = sc.nextInt();
			if(num>50 || num<1) {
				System.out.println("숫자를 잘못입력했습니다.");
				break;
			}			
			
			if(com>num) {
				System.out.println("UP! 남은기회 : "+count);
			}else if(com<num) {
				System.out.println("DOWN! 남은기회 : "+count);
			}else if(com==num) {
				System.out.println(com+"과 "+num+"이 같습니다. 정답!  남은기회 : "+count);
				break;
			}
			
			count--;
			if(count==-1) {
				System.out.println("7번안에 못맞췄습니다");
				break;
			}			
		}
		
	}
}
