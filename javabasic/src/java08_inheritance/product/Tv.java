package java08_inheritance.product;

public class Tv extends Product{
	private String model;
	private int price;
	
	public Tv(String model, int price) {
		super(model, price);	
	}
	
	@Override
	public void out() {
		super.out();
		System.out.println("Tv");
	}
	
}
