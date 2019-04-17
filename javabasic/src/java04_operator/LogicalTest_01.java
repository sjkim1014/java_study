package java04_operator;

public class LogicalTest_01 {
	public static void main(String[] args) {
		int a=5, b=6, c=10, d;
		
		d = ++a * b--;
		
		System.out.println("a :" +a+", b : "+b+", d : "+d);
		
		
		
		d = a++ + ++c - b--;
		System.out.println("a :" +a+", b : "+b+", c : "+c+", d : "+d);
		/* int a=5, b=6, c=10, d;
		 * d= ++a * b--;
		 * a=6 b=5 d=36
		 * 
		 * d=a++ + ++c - b--; 
		 * a=7 b=4 c=11 d=12
		 * 
		 * */
		
	}
}
