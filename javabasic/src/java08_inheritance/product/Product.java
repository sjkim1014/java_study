package java08_inheritance.product;



public class Product {
	protected String model;
	protected int price;
	
	public Product(String model, int price) {		
		setModel(model);
		setPrice(price);
	}
	
	public void out() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}



