package java14_exception;

class UserAgeException extends Exception{
	
//	public UserAgeException(String msg) {
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public String getMessage() {
		return "나이는 0보다 작을 수 없다";
	}
}

class User{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException{
		
		//나이는 양의 정수
		
		// 예외클래스를 이용한 처리방식
		if(age<0) {
			this.age = -1;
			//음수로  나이를 입력하려는 상황을 예외상황으로 만들기
			throw new UserAgeException();
		}
		
		//나이가 음수일 때 예외처리
//		if(age<0) {
//			System.out.println("나이는 0보다 작을 수 없다");
//			this.age = -1;
//			return;
//		}
		
		//나이가 음수가 아니라면
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
//			// 추가 처리
//		}
				
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
