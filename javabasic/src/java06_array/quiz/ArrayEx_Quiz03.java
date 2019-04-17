package java06_array.quiz;

public class ArrayEx_Quiz03 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];

		int cur = 1;
		System.out.println("Q1");
		// �Էº�
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				arr[i][j] = cur++;
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int cur1 = 1;
		System.out.println("Q2");
		// �Էº�
		for( int i=0; i<5; i++ ) {
			for( int j=4; j>=0; j-- ) {
				arr[i][j] = cur1++;
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int cur2 = 1;
		System.out.println("Q3");
		// �Էº�
		for( int j=0; j<5; j++ ) {
			for( int i=0; i<5; i++ ) {
				arr[i][j] = cur2++;
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int cur3 = 1;
		System.out.println("Q4");
		// �Էº�
		for( int j=0; j<5; j++ ) {
			for( int i=4; i>=0; i-- ) {
				arr[i][j] = cur3++;
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Q5");
			
		// �Էº�
		int cur4 = 1;
		int circle =5; // �ݺ�Ƚ�� ó���� 5ȸ
		int x=0;	//����
		int y=-1;	//����
		int count=1;	//�������¼�	
		
		for(;;){	//5���� ������
			for( int i=0; i<circle; i++ ) { //0~5����
				y+=count;				//���ΰ� ����
				arr[x][y] = cur4++;		// 00 01 02 03 04 ���ٰ� ���ڳ���
			}
			circle--;					// 14 24 34 44 �Ǿ��ϴϱ� for�ݺ�Ƚ�� 1ȸ ����
			if(circle<0) break;
			for( int i=0; i<circle; i++ ) {	//0~4����
				x+=count;				//���ΰ��� ���� , 04���� �������� 14 24 34 44����
				arr[x][y] = cur4++;		// 14 24 34 44 ���ٰ� ���� �ֱ�
			}
			count*=-1;		//�̹��� 43 42 41 40 �� �Ǿ��ϴϱ� ������ ��ȯ
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
