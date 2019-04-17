package java05_control.forEx;

public class ForExQuiz7 {
	public static void main(String[] args) {
		System.out.println("Q1");
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q2");
		for(int i=0; i<5; i++) {
			System.out.println("*");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q3");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q4");
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q5");
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q6");
		for(int i=1; i<=5; i++) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q7");
		for(int i=5; i>0; i--) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q8");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q9");
		for(int i=5; i>=1; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q10");
		for(int i=5; i>=1; i--) {		
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {				
				System.out.print("*");				
			}			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		System.out.println("Q11");
		for(int i=0; i<5; i++) {		
			for(int j=i; j<4; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {				
				System.out.print("*");				
			}			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Q12");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println();
		
		System.out.println("Q13");
		for(int i=5; i>=1; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
