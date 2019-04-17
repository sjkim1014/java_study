package java14_exception;

class ThrowEx{
	public void print(String str, int cnt) {
		//���ڿ��� null �̸� NullPointerException �߻� ��Ű��
		if(str == null) {
			throw new NullPointerException();
//			System.out.println("null �� ��� �Ұ�");
//			return;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
}

public class ExceptionEx_07_throw {
	public static void main(String[] args) {
		ThrowEx th = new ThrowEx();
		
		String str = null;
		
		try {
			th.print(str, 3);
		}catch(NullPointerException e){
			System.out.println("[WARN] ���ڿ��� null�Էµ�");
		}
		
		
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
