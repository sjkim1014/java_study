package java07_class.method;

public class Method_03 {	
	public void hund() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println();
			}			
		}
	}
	
	public void word(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("Apple");
		}
	}
	
	public void text(int num,String str) {
		for(int i=0; i<num; i++) {
			System.out.println(str);
		}
	}
	
}
