package java06_array.quiz;

public class ArrayEx_Quiz04 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int x=0,y=-1,turn=1,limit=5,cur=1;
		for(;;) {		
			
			for(int k=0; k<limit; k++) {
				y+=turn;
				arr[x][y]=cur++;				
			}
			limit--;
			if(limit<0) {
				break;
			}
			for(int j=0; j<limit; j++) {
				x+=turn;
				arr[x][y]=cur++;				
			}
			turn*=-1;			
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
