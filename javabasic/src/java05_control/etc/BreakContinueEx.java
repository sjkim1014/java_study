package java05_control.etc;

public class BreakContinueEx {
	public static void main(String[] args) {
		//break
		//����� �ߴܽ�Ű�� �ڵ�
		//if�� �ߴܽ�Ű�� �ʴ´�
		// ����� ���� �����ϴ� ��� �Ѱ��� �ߴ�
		
		for(int i=0; true; i++) {
			System.out.println(i);
			if(i>=5) {
				break;
			}
		}
		
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {	//i, 0~4
			
			for(int j=0; j<5; j++) {	//j, 0~4
				System.out.println(i+" , "+j);
				
				if(j==2) {
					break;
				}
			}
			
		}
		System.out.println("---------------");		
		//continue
		//�ݺ����� ���� �ݺ����� �ѱ��
		// for loop->�������� �Ǻ���
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {	//¦���ϰ��
				continue;
			}
			System.out.println(i);
		}
	}
}
