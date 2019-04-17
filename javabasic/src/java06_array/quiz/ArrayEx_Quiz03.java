package java06_array.quiz;

public class ArrayEx_Quiz03 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];

		int cur = 1;
		System.out.println("Q1");
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				arr[i][j] = cur++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int cur1 = 1;
		System.out.println("Q2");
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=4; j>=0; j-- ) {
				arr[i][j] = cur1++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int cur2 = 1;
		System.out.println("Q3");
		// 입력부
		for( int j=0; j<5; j++ ) {
			for( int i=0; i<5; i++ ) {
				arr[i][j] = cur2++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int cur3 = 1;
		System.out.println("Q4");
		// 입력부
		for( int j=0; j<5; j++ ) {
			for( int i=4; i>=0; i-- ) {
				arr[i][j] = cur3++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Q5");
			
		// 입력부
		int cur4 = 1;
		int circle =5; // 반복횟수 처음은 5회
		int x=0;	//세로
		int y=-1;	//가로
		int count=1;	//더해지는수	
		
		for(;;){	//5번만 돌게함
			for( int i=0; i<circle; i++ ) { //0~5까지
				y+=count;				//가로값 증가
				arr[x][y] = cur4++;		// 00 01 02 03 04 에다가 숫자넣음
			}
			circle--;					// 14 24 34 44 되야하니까 for반복횟수 1회 감소
			if(circle<0) break;
			for( int i=0; i<circle; i++ ) {	//0~4까지
				x+=count;				//세로값을 증가 , 04에서 끝났으니 14 24 34 44까지
				arr[x][y] = cur4++;		// 14 24 34 44 에다가 숫자 넣기
			}
			count*=-1;		//이번엔 43 42 41 40 이 되야하니까 음수로 변환
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
