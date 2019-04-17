package java07_class.constructor;
/*
 * ---------------
class Car
---------------
- model : String
- String color
---------------
<<constructor>>
+ Car(String,String)

<<method>>
+ display() : void

<<setter>>
+ setModel(String model) : void
+ setColor(String color) : void

<<getter>>
+ getModel() : String
+ getColor() : String
---------------

 * */
public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("K5","Black");
		c1.display();
		
		System.out.println("------------");
		c1.setModel("¸ð´×");
		c1.setColor("Èò»ö");
		
		System.out.println(c1.getModel());
		System.out.println(c1.getColor());
		System.out.println("------------");
	}
	
	
}
