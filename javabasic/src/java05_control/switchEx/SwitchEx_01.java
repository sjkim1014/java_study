package java05_control.switchEx;

public class SwitchEx_01 {
	public static void main(String[] args) {
		//switch ��
		/*
		switch(�񱳴��) { // �ַκ���
		
		case �񱳰�1:
			
		case �񱳰�2:
			
			...
			
		default:
		
		}
		*/
		
		int num = 10;
		
		switch(num) {
		case 10:
			System.out.println("���� 10");
			break;	//����� �ߴܽ�Ŵ. ��, if ����
		case 20:
			System.out.println("���� 20");
			break;
		case 30:
			System.out.println("���� 30");
			break;
		default:
			System.out.println("����Ʈ.");
			System.out.println("������ case�� ����");
		}
		
		/*
		 * if(num==10){
		 * 		
		 * }else if(num==20){
		 * 
		 * }else if(num==30){
		 * 
		 * }else{
		 * 
		 * }
		 * */
	}
}
