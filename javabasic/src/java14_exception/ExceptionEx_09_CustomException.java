package java14_exception;

class UserAgeException extends Exception{
	
//	public UserAgeException(String msg) {
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public String getMessage() {
		return "���̴� 0���� ���� �� ����";
	}
}

class User{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException{
		
		//���̴� ���� ����
		
		// ����Ŭ������ �̿��� ó�����
		if(age<0) {
			this.age = -1;
			//������  ���̸� �Է��Ϸ��� ��Ȳ�� ���ܻ�Ȳ���� �����
			throw new UserAgeException();
		}
		
		//���̰� ������ �� ����ó��
//		if(age<0) {
//			System.out.println("���̴� 0���� ���� �� ����");
//			this.age = -1;
//			return;
//		}
		
		//���̰� ������ �ƴ϶��
		this.age = age;
	}	
}

public class ExceptionEx_09_CustomException {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge(-10);
		} catch (UserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		user.setAge(-10);
//		if(user.getAge() == -1) {			
//			// �߰� ó��
//		}
				
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}
}
