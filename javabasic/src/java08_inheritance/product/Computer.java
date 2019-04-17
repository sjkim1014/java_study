package java08_inheritance.product;

public class Computer extends Product{
	private String model;
	private int price;
	
	public Computer(String model, int price) {
		super(model,price);
	}
	
	@Override
	public void out() {
		super.out();
		System.out.println("Computer");
	}
	
	
}


