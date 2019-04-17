package java07_class.manager;

public class StudentEx {
	public static void main(String[] args) {
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo();
		System.out.println();
		ss.insertScore();
		System.out.println();
		ss.printStu();
		
	}
}
