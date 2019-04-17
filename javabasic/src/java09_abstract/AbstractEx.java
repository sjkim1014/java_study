package java09_abstract;

abstract class Person{
	private String name;	//이름
	public abstract void display();
	
}
class Professor extends Person{	
	private String major;	//전공
	
	public Professor(String major) {
		this.major = major;
	}
	@Override
	public void display() {
		System.out.println("교수 , 전공 : "+major);
	}
}
class Student extends Person{
	private String subject;	//수강과목
	
	public Student(String subject) {
		this.subject = subject;
	}
	@Override
	public void display() {
		System.out.println("학생, 과목 : "+subject);
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		Person[] arr= new Person[2];
		
		arr[0] = new Student("자바");
		arr[1] = new Professor("컴퓨터공학");
		
		arr[0].display();
		arr[1].display();
	}
}
