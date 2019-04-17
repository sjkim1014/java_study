package java15_Io.filterstream;

public class PerformanceEvaluation {
	public static void main(String[] args) {
		//������
		// �۾�����ð�
		// ���۽ð� ���� ���� - start
		// [�������]
		// ����ð� ���� ���� - end
		
		// -> ����ð� = end - start
		
		//long System.currentTimeMillis();
		//����ð��� �и��ʷ� ��ȯ
		long start = System.currentTimeMillis();	//���۽ð�
		for(int i=0; i<1000; i++) {					//������ ��� ����
			System.out.println(i);
		}
		long end = System.currentTimeMillis();		//����ð�
		
		long time = end - start;
		
		System.out.println("[����ð�] : "+(time)/(double)1000);
		
	}
}
